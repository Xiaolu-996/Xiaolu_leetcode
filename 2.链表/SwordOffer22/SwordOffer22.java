package SwordOffer22;

/**
 * @author :lujianbin
 * @create :2020-07-17 20:16:00
 * @description :����һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β�ڵ��ǵ�����1���ڵ㡣���磬һ��������6���ڵ㣬��ͷ�ڵ㿪ʼ�����ǵ�ֵ������1��2��3��4��5��6���������ĵ�����3���ڵ���ֵΪ4�Ľڵ㡣
 */
public class SwordOffer22 {

public static void main(String[] args) {
	ListNode ln1 = new ListNode ();
	ListNode ln2 = new ListNode ();
	ListNode ln3 = new ListNode ();
	ListNode ln4 = new ListNode ();
	ListNode ln5 = new ListNode ();
	ln1.next = ln2;
	ln2.next = ln3;
	ln3.next = ln4;
	ln4.next = ln5;
	ln5.next = null;
	ln1.data = 1;
	ln2.data = 2;
	ln3.data = 3;
	ln4.data = 4;
	ln5.data = 5;
	
	SwordOffer22 swordOffer22 = new SwordOffer22 ();
	ListNode kthFromEnd = swordOffer22.getKthFromEnd (ln1, 2);
	System.out.println (kthFromEnd.data);
}

//���������е�k���ڵ�
public ListNode getKthFromEnd(ListNode head, int k) {
	//�ж������Ƿ�Ϊ���Լ�k�Ƿ�ΪС��0����
	if (head == null || k < 0) {
		return null;
	}
	//������ָ���ʼλ�ö�ָ��ͷ���
	ListNode fast = head;
	ListNode slow = head;
	
	//��fast�ڵ�������kλ
	for (int i = 0; i < k - 1; i++) {
		if (fast.next != null) {
			fast = fast.next;
		} else {
			return null;    //������̣�����k���ڵ�
		}
	}
	//����ָ���ƶ�k��λ�ú���ͬʱ�ƶ�����ָ�룬����ָ��Ϊ��ʱ��ָ��պ��ڵڵ���kλ����
	while (fast.next != null) {
		slow = slow.next;
		fast = fast.next;
	}
	return slow;
}
}
