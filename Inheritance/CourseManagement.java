package Inheritance;

class Course {
    String name; int duration;
    Course(String n,int d){name=n;duration=d;}
    void show(){System.out.println("Course: "+name+", Duration: "+duration+" hrs");}
}
class OnlineCourse extends Course {
    String platform; boolean recorded;
    OnlineCourse(String n,int d,String p,boolean r){super(n,d);platform=p;recorded=r;}
    void show(){super.show();System.out.println("Platform: "+platform+", Recorded: "+recorded);}
}
class PaidOnlineCourse extends OnlineCourse {
    double fee,discount;
    PaidOnlineCourse(String n,int d,String p,boolean r,double f,double dis){
        super(n,d,p,r);fee=f;discount=dis;
    }
    void show(){super.show();System.out.println("Fee: "+fee+", Discount: "+discount+"%");}
}
public class CourseManagement {
    public static void main(String[] args){
        PaidOnlineCourse poc=new PaidOnlineCourse("Java",40,"Udemy",true,5000,20);
        poc.show();
    }
}
