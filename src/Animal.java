public class Animal {

    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {

    void bark(){
        System.out.println("Barking");
    }

}
class testInheritance{
    public static void main(String[] args) {
        Dog d =new Dog();
        d.eat();
        d.bark();

    }
}
