public class Employee {

    double salary = 100000.00;
}
    class Programmer extends Employee {

        int bonus = 30000;

        public static void main(String[] args) {
            Programmer p = new Programmer();
            System.out.println("Programmer Salary  "+ p.salary);
            System.out.println("Programmer Bouns  "+p.bonus);
            double x = p.salary;
            double y = p.bonus;
            System.out.println("Programmer Income  :"+(x+y));
        }
    }


