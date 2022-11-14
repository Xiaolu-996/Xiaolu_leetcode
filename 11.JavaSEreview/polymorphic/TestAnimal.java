package polymorphic;

/**
 * @author :lujianbin
 * @create :2022-04-27 11:17:00
 * @description :多态测试
 * @solution :
 */
public class TestAnimal {
	//编译器在编译代码的时候，并不知道要调用Dog还是Cat中eat的方法
	//等程序运行起来之后，形参a引用的具体对象确定后，才知道调用哪个方法


	//此时要注意：此处的形参类型必须是父类类型才可以，也就是向上转型
	public static void eat(Animal animal) {
		animal.eat();
	}

	//使用多态调用方法时，先检查父类中是否有该方法，如果没有则编译错误，有再调用子类的同名方法
	public static void main(String[] args) {
		Animal cat = new Cat("元宝", 2);      //父类引用指向子类对象
		Animal dog = new Dog("小七", 1);
		//调用的方法和引用的具体实例有关
		eat(cat);       //animal 引用 Cat时调用的是Cat重写的方法
		eat(dog);       //animal 引用 Dog时调用的是Dog重写的方法
	}
}
