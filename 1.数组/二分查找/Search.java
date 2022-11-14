
/**
 * @author :lujianbin
 * @create :2022-11-11 14:50:00
 * @description : 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ， 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @solution :
 */
public class Search {

public static void main(String[] args) {
	System.out.println ("编码测试");
}

public int dichotomousSearch(int[] nums, int target) {
	// 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
	if (target < nums[0] || target > nums[nums.length - 1]) {
		return -1;
	}
	int left = 0, right = nums.length - 1;
	while (left <= right) {
		int mid = left + ((right - left) >> 1);
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] < target) {
			left = mid + 1;
		} else if (nums[mid] > target) {
			right = mid - 1;
		}
	}
	return -1;
}
}
