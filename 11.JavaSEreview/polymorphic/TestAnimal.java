package polymorphic;

/**
 * @author :lujianbin
 * @create :2022-04-27 11:17:00
 * @description :��̬����
 * @solution :
 */
public class TestAnimal {
	//�������ڱ�������ʱ�򣬲���֪��Ҫ����Dog����Cat��eat�ķ���
	//�ȳ�����������֮���β�a���õľ������ȷ���󣬲�֪�������ĸ�����


	//��ʱҪע�⣺�˴����β����ͱ����Ǹ������Ͳſ��ԣ�Ҳ��������ת��
	public static void eat(Animal animal) {
		animal.eat();
	}

	//ʹ�ö�̬���÷���ʱ���ȼ�鸸�����Ƿ��и÷��������û�������������ٵ��������ͬ������
	public static void main(String[] args) {
		Animal cat = new Cat("Ԫ��", 2);      //��������ָ���������
		Animal dog = new Dog("С��", 1);
		//���õķ��������õľ���ʵ���й�
		eat(cat);       //animal ���� Catʱ���õ���Cat��д�ķ���
		eat(dog);       //animal ���� Dogʱ���õ���Dog��д�ķ���
	}
}
