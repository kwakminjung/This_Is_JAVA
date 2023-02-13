package ch07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//�Ű������� ������
		animalSound(new Dog()); //�ڵ� Ÿ�� ��ȯ
		animalSound(new Cat()); //�ڵ� Ÿ�� ��ȯ
	}
	
	public static void animalSound(Animal animal) {
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
	}
}
