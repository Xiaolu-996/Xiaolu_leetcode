package extensReview;

/**
 * @author :lujianbin
 * @create :2022-04-27 10:31:00
 * @description :�̳и�ϰ
 * @solution :
 * 1.����ӵ�и���� private �����ԡ�������
 * <p>
 * 2.�������ӵ���Լ������Ժͷ�������������ԶԸ��������չ��
 * <p>
 * 3.����������Լ��ķ�ʽʵ�ָ���ķ�����
 * <p>
 * 4.Java �ļ̳��ǵ��̳У����ǿ��Զ��ؼ̳�  A�̳�B��B�̳�C��C�̳�D
 */
public class Animal {
	private String name;
	private int id;

	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}

	public void sing() {
		System.out.println("�����Sing����");
	}

	public void eat() {
		System.out.println(name + "���ڳ�");
	}

	public void sleep() {
		System.out.println(name + "����˯");
	}

	public void introduction() {
		System.out.println("��Һã�����" + id + "��" + name + ".");
	}
}


