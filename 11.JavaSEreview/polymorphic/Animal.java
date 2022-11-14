package polymorphic;

/**
 * @author :lujianbin
 * @create :2022-04-27 11:18:00
 * @description :һ��.java�ļ������ж���࣬��ֻ����һ��public�������ļ���һ��
 * @solution :��̬�������̳У���д��ͨ���������õ�����д����
 */
public class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "�Է�");
	}
}

class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(name + "����");
	}
}

class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(name + "�Թ�ͷ");
	}
}

