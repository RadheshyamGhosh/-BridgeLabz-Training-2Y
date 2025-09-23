package Inheritance;
class Animal {
    String name; int age;
    Animal(String n,int a){name=n;age=a;}
    void makeSound(){System.out.println("Animal sound");}
}

class Dog extends Animal {
    Dog(String n,int a){super(n,a);}
    void makeSound(){System.out.println(name+" barks");}
}

class Cat extends Animal {
    Cat(String n,int a){super(n,a);}
    void makeSound(){System.out.println(name+" meows");}
}

class Bird extends Animal {
    Bird(String n,int a){super(n,a);}
    void makeSound(){System.out.println(name+" chirps");}
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        new Dog("Tommy",3).makeSound();
        new Cat("Kitty",2).makeSound();
        new Bird("Mithu",1).makeSound();
    }
}
