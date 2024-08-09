package Oops;

public class copy_con {
    public static class student{
   
        String name;
        int roll;
        //int marks[];
    
        student(student s1){ // copy constructor
           // marks=new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            //this.marks=s1.marks;
        }
        student(){
            
        }

    public static void main(String[] args) {
        student s1=new student(); 
         s1.name="ankur";
         s1.roll=213;
        // s1.marks[0]=100;
        // s1.marks[1]=22;
        // s1.marks[2]=65;

         student s2 = new student(s1); //copy 
        System.out.println(s2.name);
    }
}

}