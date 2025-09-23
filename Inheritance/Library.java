package Inheritance;

class Book {
    String title; int year;
    Book(String t,int y){title=t;year=y;}
    void displayInfo(){System.out.println("Book: "+title+" ("+year+")");}
}
class Author extends Book {
    String name,bio;
    Author(String t,int y,String n,String b){super(t,y);name=n;bio=b;}
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author: "+name+" | Bio: "+bio);
    }
}
public class Library {
    public static void main(String[] args){
        Author a=new Author("Java Basics",2023,"John Doe","Tech Writer");
        a.displayInfo();
    }
}
