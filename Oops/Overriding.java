package Oops;

public class Overriding {
    public static class Animal{
        void eat(){
            System.out.println("Eat Anything");
        }
    }
    public static class dear extends Animal{
        void eat(){
            System.out.println("Eat Grass");
        }

    public static void main(String[] args) {
        //dear d=new dear();
        Animal d=new Animal();
        d.eat();

    }
}

}