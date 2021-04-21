

public class HelloWorld {
    public static void main(String[] args) {
		System.out.println("Hello World");
		Dog dog = new Dog();
		System.out.println(dog.bark());

		Cat cat = new Cat();
		System.out.println(cat.meow());

		Frog frog = new Frog();
		System.out.println(frog.kokak());
    }
}