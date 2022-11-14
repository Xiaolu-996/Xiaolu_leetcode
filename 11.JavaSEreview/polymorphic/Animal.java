package polymorphic;

/**
 * @author :lujianbin
 * @create :2022-04-27 11:18:00
 * @description :一个.java文件可以有多个类，但只能有一个public类且与文件名一致
 * @solution :多态条件：继承，重写，通过父类引用调用重写方法
 */
public class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "吃饭");
	}
}

class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(name + "吃鱼");
	}
}

class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(name + "吃骨头");
	}
}

