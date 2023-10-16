public class Car {

    void drive(){
        System.out.println("Driving");
    }

}
class Audi extends Car {

    void autoDrive(){
        System.out.println("Auto Driving!");

    }
}
class Audi2024 extends Audi{

    void flying(){
        System.out.println("Flying");
    }
}
class test {
    public static void main(String[] args) {
        Audi2024 a = new Audi2024();
        a.drive();a.flying();a.autoDrive();
    }



}
