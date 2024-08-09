
package Oops;

public class constructor {
    public static void main(String[] args) {
       student s1=new student("Ankur",213); 
       System.out.println(s1.name);
       System.out.println(s1.roll);
       student s2=new student("Raj");
       student s3=new student("Ankur damor");
       student s4=new student(5);
       System.out.println(s3.name);
       System.out.println(s4.roll);
       System.out.println(s2.name);

       
    }
}

class student{
    String name;
    int roll;

    student(String name,int roll){
        this.name=name;
        this.roll=roll;
       
    }
    student(){
        System.out.println("Constructor is called...");
    }
    student(String name){
        this.name=name;
    }
    student(int roll){
        this.roll=roll;
    }
    
}