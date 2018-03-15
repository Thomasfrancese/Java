package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Bonjour human = new Human();
        Bonjour dog = new Dog();
        Bonjour duck = new Duck();

        System.out.println(human.sayHello());
        System.out.println(dog.sayHello());
        System.out.println(duck.sayHello());

    }
}