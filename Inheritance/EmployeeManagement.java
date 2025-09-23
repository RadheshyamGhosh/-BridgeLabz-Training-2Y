package Inheritance;

class Employee {
    String name; int id; double salary;
    Employee(String n,int i,double s){name=n;id=i;salary=s;}
    void display(){System.out.println(name+" "+id+" "+salary);}
}
class Manager extends Employee {
    int teamSize;
    Manager(String n,int i,double s,int t){super(n,i,s);teamSize=t;}
    void display(){super.display();System.out.println("Team:"+teamSize);}
}
class Developer extends Employee {
    String lang;
    Developer(String n,int i,double s,String l){super(n,i,s);lang=l;}
    void display(){super.display();System.out.println("Lang:"+lang);}
}
class Intern extends Employee {
    String college;
    Intern(String n,int i,double s,String c){super(n,i,s);college=c;}
    void display(){super.display();System.out.println("College:"+college);}
}
public class EmployeeManagement {
    public static void main(String[] args){
        Employee[] e={
            new Manager("Alice",101,90000,10),
            new Developer("Bob",102,60000,"Java"),
            new Intern("Charlie",103,20000,"XYZ Univ")
        };
        for(Employee emp:e) emp.display();
    }
}
