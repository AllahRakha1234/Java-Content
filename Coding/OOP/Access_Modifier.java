class MyEmployee{
    private  int age, salary ;
    private String name ;
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(int s){
        salary = s;
    }
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
public class Access_Modifier {
    public static void main(String[] args) {

        MyEmployee E1 = new MyEmployee();
        MyEmployee E2 = new MyEmployee();
        E1.setName("Ahmad");
        E1.setAge(22);
        E1.setSalary(200000);
        E2.setName("Akram");
        E2.setAge(32);
        E2.setSalary(230000);
        System.out.println("The name of employee is: " + E1.getName());
        System.out.println("The age of employee is: " + E1.getAge());
        System.out.println("The salary of employee is: " + E1.getSalary());
        System.out.println("The name of employee is: " + E2.getName());
        System.out.println("The age of employee is: " + E2.getAge());
        System.out.println("The salary of employee is: " + E2.getSalary());
    }
}



