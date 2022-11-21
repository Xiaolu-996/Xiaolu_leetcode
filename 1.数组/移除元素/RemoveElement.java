/**
 * @author : Xiaolu
 * @create : 2022-11-21 09:38:00
 * @order :	leetcode_27 移除元素
 * @description : 双指针/快慢指针法：通过一个快指针和慢指针在一个for循环下完成两个for循环的工作
 * @solution :如果 fast 遇到需要去除的元素，则直接跳过，否则就告诉 slow 指针，并让 slow 前进一步。
 */
public class RemoveElement {


public static void main(String[] args) {
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.println ("After removing 删: " + removeElement2 (nums, 6));
	for (int num : nums) {
		System.out.print (num + " ");
	}
	System.out.println ("length: " + nums.length);
}

public static int removeElement2(int[] nums, int val) {
	//快慢指针
	int slowIndex = 0;
	for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
		//fastIndex寻找新数组的元素，遇到要去除的元素，直接跳过
		if (nums[fastIndex] != val) {
			nums[slowIndex] = nums[fastIndex];
			slowIndex++;
		}
	}
	return slowIndex;
}

}