
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks on land");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  
        dog.walk();  
        dog.bark();  
    }
}
