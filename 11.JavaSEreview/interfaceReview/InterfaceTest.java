package interfaceReview;

/**
 * @author :lujianbin
 * @create :2022-04-27 10:54:00
 * @description :多个接口的实现，间接实现多继承
 * @solution :
 */
public class InterfaceTest implements interfaceA, interfaceB {
	@Override
	public void eat() {
		System.out.println("eat");
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
	}

	@Override
	public void sing() {
		System.out.println("sing");
	}

	@Override
	public void speak() {
		System.out.println("speak");
	}

	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		interfaceTest.eat();
		interfaceTest.sleep();
		interfaceTest.sing();
		interfaceTest.speak();
	}
}
