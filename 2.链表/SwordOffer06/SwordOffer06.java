package SwordOffer06;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2020-07-31 11:07:00
 * @description :从尾到头打印链表
 */
public class SwordOffer06 {

public static void main(String[] args) {
	ListNode ln1 = new ListNode (1);
	ListNode ln2 = new ListNode (2);
	ListNode ln3 = new ListNode (3);
	ListNode ln4 = new ListNode (4);
	ListNode ln5 = new ListNode (5);
	ListNode ln6 = new ListNode (6);
	ln1.next = ln2;
	ln2.next = ln3;
	ln3.next = ln4;
	ln4.next = ln5;
	ln5.next = ln6;
	ln6.next = null;
	SwordOffer06 swordOffer = new SwordOffer06 ();
	int[] array = swordOffer.reversePrint (ln1);
	for (int value : array) {
		System.out.print (value + "->");
	}
	System.out.println ("null");
}

public int[] reversePrint(ListNode head) {
	ArrayList<Integer> list = new ArrayList<> ();
	while (head != null) {
		list.add (head.val);
		head = head.next;
	}
	int size = list.size ();
	int[] array = new int[size];
	for (int i = 0; i < size; i++) {
		array[i] = list.get (size - 1 - i);
	}
	return array;
}
}
