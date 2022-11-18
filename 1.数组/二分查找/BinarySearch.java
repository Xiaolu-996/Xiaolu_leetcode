/**
 * @author :lujianbin
 * @create :2022-11-11 14:50:00
 * @order : leetcode_704——二分查找
 * @description : 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ， 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @solution : 选取一个mid值，在有序数组中，如果target>a[mid]则到右边区间搜索，若小于则去左边区间搜索
 * @connect :类似题目 34/剑指offer 53
 */
public class BinarySearch {

public static void main(String[] args) {
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] leftNums = {1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,};
	int[] rightNums = {1, 2, 3, 3, 3, 3, 4, 5};
	int target = 3;
	System.out.println ("普通二分搜索查找到的下标为：" + search (nums, target));
	System.out.println ("寻找左侧边界的二分搜索查找到的下标为：" + leftBound (leftNums, target));
	System.out.println ("寻找右侧边界的二分搜索查找到的下标为：" + rightBound (rightNums, target));
}

// 1.定义target在左闭右闭的区间里，[left, right]
public static int search(int[] nums, int target) {
	// 避免当 target 小于nums[0]或target大于 nums[nums.length - 1]时多次循环运算
	if (target < nums[0] || target > nums[nums.length - 1]) {
		return -1;
	}
	//	左边界
	int left = 0;
	// 右边界
	int right = nums.length - 1;
	// 左边界>=右边界时结束搜索
	while (left <= right) {
		// left + (right - left) / 2 就和 (left + right) / 2 的结果相同，但是有效防止了 left 和 right 太大，直接相加导致溢出的情况。
		int mid = left + ((right - left) >> 1);
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			// 中间值大于target，则在左区间搜索
			right = mid - 1;
		} else if (nums[mid] < target) {
			// 中间值小于target，则在右区间搜索
			left = mid + 1;
		}
	}
	return -1;
}


// 2.定义区间在左闭右开区间[left, right)
public static int search2(int[] nums, int target) {
	int left = 0;
	// 左闭右开的区间[left, right)
	int right = nums.length;
	// while(left < right) 的终止条件是 left == right，写成区间的形式就是 [right, right]
	// 排除左闭右闭的情况 [2,2]
	while (left < right) {
		int mid = left + ((right - left) >> 1);
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			// target 在左区间，在[left, middle)中,右侧为开区间
			right = mid;
		} else if (nums[mid] < target) {
			left = mid + 1;
		}
	}
	return -1;
}

// 比如说给你有序数组 nums = [1,2,2,2,3]，target 为 2，此算法返回的索引是 2，没错。
// 但是如果我想得到 target 的左侧边界，即索引 1，或者我想得到 target 的右侧边界，即索引 3，这样的话此算法是无法处理的。
// 3.寻找左侧边界的二分搜索
public static int leftBound(int[] nums, int target) {
	int left = 0;
	// 注意右侧为开区间
	int right = nums.length;
	// 注意while结束条件不包含等于
	while (left < right) {
		int mid = left + (right - left) / 2;
		if (nums[mid] == target) {
			// 收紧右侧边界以锁定左侧边界
			right = mid;
		} else if (nums[mid] < target) {
			left = mid + 1;
		} else if (nums[mid] > target) {
			// target 在左区间，在[left, middle)中,右侧为开区间
			right = mid;
		}
	}
	return left;
}


// 4.寻找右侧边界的二分搜索
public static int rightBound(int[] nums, int target) {
	int left = 0;
	int right = nums.length;
	
	while (left < right) {
		int mid = left + (right - left) / 2;
		if (nums[mid] == target) {
			// 收紧左侧边界以锁定右侧边界，左侧收缩为left=mid+1
			left = mid + 1;
		} else if (nums[mid] < target) {
			left = mid + 1;
		} else if (nums[mid] > target) {
			right = mid;
		}
	}
	// 又因为收紧左侧边界时必须 left = mid + 1，所以最后无论返回 left 还是 right，必须减一
	return right - 1;
}
}
