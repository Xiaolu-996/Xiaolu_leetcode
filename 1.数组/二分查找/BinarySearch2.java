/**
 * @author : Xiaolu
 * @create : 2022-11-16 09:49:00
 * @order : leetcode_34——在排序数组中查找元素的第一个和最后一个位置
 * @description :给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * @solution :示例 1： 输入：nums = [5,7,7,8,8,10], target = 8 输出：[3,4]
 */
public class BinarySearch2 {

public static void main(String[] args) {
	int[] nums = {5, 7, 7, 8, 8, 10};
	for (int i : searchRange (nums, 6)) {
		System.out.println ("6: " + i);
	}
	for (int i : searchRange (nums, 8)) {
		System.out.println ("8: " + i);
	}
}

public static int[] searchRange(int[] nums, int target) {
	//nums length equals 0
	if (nums.length == 0) {
		return new int[]{-1, -1};
	}
	//排除nums数组不包含target的情况
	boolean contains = false;
	for (int num : nums) {
		if (num == target) {
			contains = true;
			break;
		}
	}
	if (!contains) {
		return new int[]{-1, -1};
	}
	return new int[]{leftBound (nums, target), rightBound (nums, target)};
}




//搜索左侧边界
public static int leftBound(int[] nums, int target) {
	int left = 0;
	//左闭右开
	int right = nums.length;
	while (left < right) {
		//	System.out.println ("left: " + left + " right: " + right);
		int mid = left + ((right - left) >> 1);
		//	System.out.println ("mid = " + mid);
		if (nums[mid] == target) {
			//收缩右边界以锁定左边界
			right = mid;
		} else if (nums[mid] < target) {
			left = mid + 1;
		} else if (nums[mid] > target) {
			//右侧开区间
			right = mid;
		}
	}
	return left;
}




//搜索右侧边界
public static int rightBound(int[] nums, int target) {
	int left = 0;
	int right = nums.length;
	while (left < right) {
		int mid = left + ((right - left) >> 1);
		if (nums[mid] == target) {
			//收缩左侧边界以锁定右侧边界
			left = mid + 1;
		} else if (nums[mid] < target) {
			left = mid + 1;
		} else if (nums[mid] > target) {
			right = mid;
		}
	}
	return right - 1;
}
}
