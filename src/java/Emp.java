class Employee{
    int Id;
    String name;
    double salary;
     Employee(int p,String q,double r){ //default constructor : class name and constructor name should be same
       Id =p;
       name =q;
       salary =r;
        System.out.println(Id);
        System.out.println(name);
        System.out.println(salary);
    }

        }
public class Emp {
    public static void main(String[] args) {
        Employee obj1=new Employee(789,"krishna",900000);

    }
}
