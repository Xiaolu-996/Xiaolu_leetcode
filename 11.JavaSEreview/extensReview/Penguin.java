package extensReview;

/**
 * @author :lujianbin
 * @create :2022-04-27 10:32:00
 * @description :
 * @solution :
 */
public class Penguin extends Animal {
	//ͨ��super�������Ե��ø���Ĺ��췽��������ķ���������
	public Penguin(String myName, int myid) {
		super(myName, myid);
	}

	public static void main(String[] args) {
		Penguin penguin = new Penguin("���", 2);
		penguin.eat();
		penguin.sleep();
		penguin.introduction();
	}
}
