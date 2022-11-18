/**
 * @author : Xiaolu
 * @create : 2022-11-17 10:25:00
 * @order : leetcode_1011：在D天内送达包裹的能力
 * @description :传送带上的包裹必须在 days 天内从一个港口运送到另一个港口。 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量（weights）的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。 返回能在 days 天内将传送带上的所有包裹送达的船的最低运载能力。
 * @solution : 如果遇到一个算法问题，能够确定 x, f(x), target 分别是什么，并写出单调函数 f 的代码。 f(x) == D 的约束下，算出船的最小载重。
 */
public class BinarySearch4 {

public static void main(String[] args) {
	int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int days = 5;
	System.out.println (shipWithinDays (weights, days));
}

//求最值的过程必然是一个搜索边界的问题
//在D天数相同的情况下，求得船的最小载重量，也就是求最左侧边界
public static int shipWithinDays(int[] weights, int days) {
	// 二分法的左边界和右边界
	int left = 0;
	int right = 0;
	// 左边界：单次最少需要的容量，也就是整个重量的最大值，这样就可以满足对于任意的重量都可以一次带完
	// 右边界：所有重量的总和，也就是只运输一次
	for (int w : weights) {
		left = Math.max (left, w);
		right += w;
	}
	
	while (left < right) {
		// mid 指的是尝试的容量大小
		int mid = left + ((right - left) >> 1);
		if (days == check (weights, mid)) {
			// 天数相同的情况下，收紧右侧边界以锁定左侧边界，即船的最小载重量
			right = mid;
		} else if (check (weights, mid) > days) {
			//当前容量运完货物所需的天数 大于 输入天数
			//则船的容量需要增加才能在规定天数内运完货物
			left = mid + 1;
		} else if (check (weights, mid) < days) {
			//当前容量运完货物所需的天数 大于 输入天数
			//则在天数满足的条件下减小船的容量
			right = mid;
		}
	}
	return left;
}


// 定义：当运载能力为 x 时，需要 f(x) 天运完所有货物, f(x) 随着 x 的增加单调递减、
// 当前mid尝试的容量大小，需要多少天运送完货物
public static int check(int[] weights, int x) {
	int days = 0;
	for (int i = 0; i < weights.length; ) {
		//当前船的容量，并重复使用当前船
		int cap = x;
		while (i < weights.length) {
			// 如果当前运输重量已经超过容量 mid，那么就需要另起一天 count++，而且清空缓存区
			if (cap < weights[i]) {
				break;
			} else {
				// 否则用mid的当前容量-当前货物的重量
				cap -= weights[i];
			}
			// 继续下一个货物
			i++;
		}
		//船容量不足时天数+1
		days++;
	}
	return days;
}

}
