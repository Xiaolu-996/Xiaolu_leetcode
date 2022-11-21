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

//˫ָ�뷽��:����ָ�룬ȡֵһһ�Ƚϣ������ͬ��������ֵ(������������)
public ListNode removeDuplicateNodes(ListNode head) {
	ListNode cur = head;        //curָ��ͷ���
	while (cur != null) {
		ListNode temp = cur;    //tempָ��curָ��
		while (temp.next != null) {
			if (temp.next.val == cur.val) {
				temp.next = temp.next.next;     //������ֺ�����ֵ��ͬ�Ľڵ�������
			} else {
				temp = temp.next;     //���αȽ���������нڵ�
			}
		}
		cur = cur.next;   //��ֵ�Ƚ����Ƚ���һ��ֵ
	}
	return head;
}

//ʹ��set���Ͻ���ȥ��
public ListNode removeDuplicateNodes2(ListNode head) {
	HashSet<Integer> set = new HashSet<> ();
	ListNode cur = head;
	while (cur != null && cur.next != null) {
		set.add (cur.val);   //��Ԫ��ȫ������set����
		if (set.contains (cur.next.val)) {       //����ÿ��Ԫ����Ƚ϶���Ƚϣ������ͬ�򷵻�true
			cur.next = cur.next.next;           //set���ϵ�containsҪ�ж�hashcode������equals����
		} else {                                //list���ϵ�contains����ֻ�ж�equals����
			cur = cur.next;
		}
	}
	return head;
}
}














