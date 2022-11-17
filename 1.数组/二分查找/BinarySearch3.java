/**
 * @author : Xiaolu
 * @create : 2022-11-16 17:39:00
 * @order : leetcode_69：x的平方根 & leetcode_367：有效的完全平方数
 * @description :给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * @solution :二分法
 */
public class BinarySearch3 {

public static void main(String[] args) {
	//System.out.println (mySqrt (10));
	System.out.println (isPerfectSquare (9));
}

public static int mySqrt(int x) {
	//特殊值处理
	if (x == 0) {
		return 0;
	}
	if (x == 1) {
		return 1;
	}
	long left = 0;
	long right = x;
	//在闭区间[left, right]搜索
	//左边界>=右边界的时候退出循环
	while (left <= right) {
		long mid = left + ((right - left) >> 1);
		if (mid * mid == x) {
			return (int) mid;
		} else if ((mid * mid) < x) {
			//左加右减
			//相乘的值小于mid则left边界=mid+1
			left = mid + 1;
		} else if ((mid * mid) > x) {
			//相乘的值大于mid则右侧边界=mid-1
			right = mid - 1;
		}
	}
	return (int) right;
}

// 因为 num 是正整数，所以若正整数 x 满足 x×x=num，则 x 一定满足 1≤x≤num。
// 于是可以将 1 和 num 作为二分查找搜索区间的初始边界，在区间中进行判断。
public static boolean isPerfectSquare(int num) {
	if (num == 1) {
		return true;
	}
	long left = 1;
	long right = num;
	while (left <= right) {
		long mid = left + ((right - left) >> 1);
		if ((mid * mid) == num) {
			return true;
		} else if ((mid * mid) < num) {
			left = mid + 1;
		} else if ((mid * mid) > num) {
			right = mid - 1;
		}
	}
	return false;
}


}
