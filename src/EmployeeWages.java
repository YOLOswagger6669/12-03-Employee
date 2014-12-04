// placeholder for your main method
public class EmployeeWages {
    public static void main(String[] args) {
        // replace <put your name here> with your name!
        System.out.println("Student: Samuel Aaron Mosley");
        
        // Create two instances of class Employee emp1 & emp2
        Employee emp1=new Employee("Sam", 666, 69);
        Employee emp2=new Employee("Naman", 10, 35);
        // print emp1 
        System.out.println(emp1.toString());
        // print emp1's weekly salary (put a tab first) like "       weekly salary: $360.00" 
        System.out.println("\t weekly salary: $"+emp1.getWeeklySalary());
        // print emp1's annual salary (put a tab first) like "       annual salary: $18,720.00" 
        System.out.println("\t weekly salary: $"+emp1.getYearlySalary());
        // print emp2
        System.out.println(emp2.toString());
        // change emp2's name
        emp2.setName("Kyle");
        // change emp2's wage
        emp2.setWage(.00000000000000000000000000000000000000000000000007);
        // change emp2's hours
        emp2.setHours(100);
        // print emp2 
        System.out.println(emp2.toString());
        // print emp2's weekly salary (put a tab first) like "       weekly salary: $360.00" 
        System.out.println("\t weekly salary: $"+emp1.getWeeklySalary());
        // print emp2's annual salary (put a tab first) like "       annual salary: $18,720.00" 
        System.out.println("\t weekly salary: $"+emp1.getYearlySalary());
        // give emp2 a raise
        emp2.giveRaise();
        // print emp2
        System.out.println(emp2.toString());
    }
}
