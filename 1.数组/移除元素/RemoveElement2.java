/**
 * @author : Xiaolu
 * @create : 2022-11-23 10:02:00
 * @order : leetcode_26 移除有序数组中的重复项
 * @description : 双指针/快慢指针思路
 * @solution :让慢指针 slow 走在后面，快指针 fast 走在前面探路，找到一个不重复的元素就告诉 slow 并让 slow 前进一步。这样当 fast 指针遍历完整个数组 nums 后，nums[0..slow] 就是不重复元素。
 */
public class RemoveElement2 {

public static void main(String[] args) {
	int[] nums = {1, 1, 2};
	System.out.println (removeDuplicates (nums));
}


public static int removeDuplicates(int[] nums) {
	int fastIndex;
	int slowIndex = 0;
	//如果值相同则跳过
	for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
		if (nums[fastIndex] != nums[slowIndex]) {
			slowIndex++;
			nums[slowIndex] = nums[fastIndex];
		}
	}
	//数组长度为索引+1
	return slowIndex + 1;
}
}
