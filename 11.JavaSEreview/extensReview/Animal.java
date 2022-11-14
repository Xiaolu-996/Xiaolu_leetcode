package extensReview;

/**
 * @author :lujianbin
 * @create :2022-04-27 10:31:00
 * @description :继承复习
 * @solution :
 * 1.子类拥有父类非 private 的属性、方法。
 * <p>
 * 2.子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
 * <p>
 * 3.子类可以用自己的方式实现父类的方法。
 * <p>
 * 4.Java 的继承是单继承，但是可以多重继承  A继承B，B继承C，C继承D
 */
public class Animal {
	private String name;
	private int id;

	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}

	public void sing() {
		System.out.println("父类的Sing方法");
	}

	public void eat() {
		System.out.println(name + "正在吃");
	}

	public void sleep() {
		System.out.println(name + "正在睡");
	}

	public void introduction() {
		System.out.println("大家好！我是" + id + "号" + name + ".");
	}
}


