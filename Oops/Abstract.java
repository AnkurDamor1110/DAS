package Oops;

public class Abstract {
    public static void main(String[] args) {
         house h =new house();
         h.eat();
         h.walks();
         System.out.println(h.color);
         chikan c=new chikan();
         c.eat();
         c.walks();

        // Animal a= new Animal(); // Abstract class have not object creat
    }
}

 abstract class Animal{
    String color;
    Animal(){ // defult color brown 
        color="Brown";
        System.out.println("Animal");
    }
     void eat(){
        System.out.println("Eat grass");
     }

     abstract void walks(); //give only idea
}

class house extends Animal{
    house(){
        System.out.println("House");
    }
    void changecolor(String newcolor){
        color=newcolor;
    }
    void walks(){
        System.out.println("walks 4 legs");
    }

}
class mustang extends house{
    mustang(){
        System.out.println("Mostang");
    }
}
class chikan extends Animal{
     void walks(){
        System.out.println("walks 2 legs");
     }
}