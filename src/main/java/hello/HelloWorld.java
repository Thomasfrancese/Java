package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Bonjour human = new Human();
        Bonjour dog = new Dog();

        System.out.println(human.sayHello());
        System.out.println(dog.sayHello());

    }
}