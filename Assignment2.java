public class Assignment2 {

	public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        dog.sleep();
		
		Animal cat=new Cat();
		cat.sound();
		cat.eat();
		cat.sleep();
		

	}

}

abstract class Animal{
	abstract void sound();
	void eat(){
		System.out.println("This animal is eating.");
	}
	void sleep(){
		System.out.println("This animal is sleeping.");
	}
}

class Dog extends Animal{
	@Override
    void sound() {
		System.out.println("Dog makes : Woof");
	}
}

class Cat extends Animal{
    @Override
    void sound() {
		System.out.println("Cat makes: Meow");
	}
}