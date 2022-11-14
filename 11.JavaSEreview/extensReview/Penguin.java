package extensReview;

/**
 * @author :lujianbin
 * @create :2022-04-27 10:32:00
 * @description :
 * @solution :
 */
public class Penguin extends Animal {
	//通过super方法可以调用父类的构造方法，父类的方法和属性
	public Penguin(String myName, int myid) {
		super(myName, myid);
	}

	public static void main(String[] args) {
		Penguin penguin = new Penguin("企鹅", 2);
		penguin.eat();
		penguin.sleep();
		penguin.introduction();
	}
}
