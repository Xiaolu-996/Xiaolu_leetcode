package extensReview;

/**
 * @author :lujianbin
 * @create :2022-04-27 10:32:00
 * @description :
 * @solution :
 */
public class Mouse extends Animal {
	public Mouse(String myName, int myid) {
		super(myName, myid);
	}

	public void sing() {
		System.out.println("子类的Sing方法");
	}

	public void testSuperThis() {
		super.sing();
		this.sing();
	}

	public static void main(String[] args) {
		Mouse mouse = new Mouse("老鼠", 1);
		mouse.eat();
		mouse.sleep();
		mouse.introduction();
		mouse.testSuperThis();
	}
}
