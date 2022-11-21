package Interview0201;

import java.util.HashSet;

/**
 * @author :lujianbin
 * @create :2020-07-30 20:58:00
 * @description :
 */
public class Interview0201 {

public static void main(String[] args) {
	ListNode ln1 = new ListNode (1);
	ListNode ln2 = new ListNode (3);
	ListNode ln3 = new ListNode (4);
	ListNode ln5 = new ListNode (1);
	ListNode ln6 = new ListNode (3);
	ListNode ln7 = new ListNode (4);
	ln1.next = ln2;
	ln2.next = ln3;
	ln5.next = ln6;
	ln6.next = ln7;
	Interview0201 interview0201 = new Interview0201 ();
	ListNode listNode = interview0201.removeDuplicateNodes (ln1);
	while (listNode != null) {
		System.out.print (listNode.val + "->");
		listNode = listNode.next;
	}
	System.out.println ("null");
}

//双指针方法:两个指针，取值一一比较，如果相同则跳过该值(类似排序链表)
public ListNode removeDuplicateNodes(ListNode head) {
	ListNode cur = head;        //cur指向头结点
	while (cur != null) {
		ListNode temp = cur;    //temp指向cur指针
		while (temp.next != null) {
			if (temp.next.val == cur.val) {
				temp.next = temp.next.next;     //如果发现后面有值相同的节点则跳过
			} else {
				temp = temp.next;     //依次比较下面的所有节点
			}
		}
		cur = cur.next;   //该值比较完后比较下一个值
	}
	return head;
}

//使用set集合进行去重
public ListNode removeDuplicateNodes2(ListNode head) {
	HashSet<Integer> set = new HashSet<> ();
	ListNode cur = head;
	while (cur != null && cur.next != null) {
		set.add (cur.val);   //将元素全部放入set集合
		if (set.contains (cur.next.val)) {       //遍历每个元素与比较对象比较，如果相同则返回true
			cur.next = cur.next.next;           //set集合的contains要判断hashcode方法和equals方法
		} else {                                //list集合的contains方法只判断equals方法
			cur = cur.next;
		}
	}
	return head;
}
}














