class Employee{
    int age, salary ;
    String name ;
    public int getAge(){
        return age ;
    }
    public int getSalary(){
        return salary ;
    }
    public String getName(){
        return name ;
    }
}
public class Class_Object {
    public static void main(String[] args) {

        Employee E1 = new Employee();
        Employee E2 = new Employee();
        E1.name = "Ali" ;
        E1.age = 34 ;
        E1.salary = 65000 ;
        E2.name = "Hassan" ;
        E2.age = 24 ;
        E2.salary = 45000 ;
        System.out.println("The name of employee is: " + E1.getName());
        System.out.println("The age of employee is: " + E1.getAge());
        System.out.println("The salary of employee is: " + E1.getSalary());
        System.out.println("The name of employee is: " + E2.getName());
        System.out.println("The age of employee is: " + E2.getAge());
        System.out.println("The salary of employee is: " + E2.getSalary());
    }
}

