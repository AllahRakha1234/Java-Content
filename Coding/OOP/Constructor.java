
class Employees{
    private  int age, salary ;
    private String name ;
//    Methods and Constructors
    public Employees(){
        age = 0 ;
        salary = 0;
    }
    public Employees(int a, String n, int s){
        age = a ;
        name = n;
        salary = s;
    }

    // ********************* By using Alt+Insert ***********************
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    public void setAge(int a){
//        age = a;
//    }
//    public void setName(String n){
//        name = n;
//    }
//    public void setSalary(int s){
//        salary = s;
//    }
//    public int getAge(){
//        return age ;
//    }
//    public int getSalary(){
//        return salary ;
//    }
//    public String getName(){
//        return name ;
//    }
}

public class Constructor {
    public static void main(String[] args) {
//        Employees e1 = new Employees();
        Employees e1 = new Employees(32, "Nauman", 45000);
        System.out.println("The name of employee is: " + e1.getName());
        System.out.println("The age of employee is: " + e1.getAge());
        System.out.println("The salary of employee is: " + e1.getSalary());
    }
}
