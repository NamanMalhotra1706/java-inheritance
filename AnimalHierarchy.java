class Animal{
    public String name;
    public int age;

    Animal(String name, int age){
        System.out.println("Calling Animal Constructor");
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Calling function of Animal Class");
    }
}

class Dog extends Animal{
    Dog(String name, int age){
//        this.name = name;
//        this.age = age;
        // These two only when, there are attributes in the class
        super(name,age);
        System.out.println("Calling Dog Constructor");
    }

    @Override
    public void makeSound(){
        System.out.println(name+ " krta Bhau, Bhau!");
    }
}

class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
        System.out.println("Calling Billi Constructor");
    }
    public void makeSound(){
        System.out.println(name+ " krti Meow, Meow!");
    }
}

class Bird extends Animal{

    Bird(String name, int age) {
        super(name, age);
        System.out.println("Calling Chiddia Constructor");
    }
    public void makeSound(){
        System.out.println(name+" krti Chew, Chew!");
    }
}


public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy",5);
        tuffy.makeSound();

        System.out.println();
        Cat chameli = new Cat("chameli", 7);
        chameli.makeSound();

        System.out.println();
        Bird popat = new Bird("popat",2);
        popat.makeSound();
    }

}
