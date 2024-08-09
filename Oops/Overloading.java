package Oops;

public class Overloading {
    public static void main(String[] args) {
        calculator s=new calculator();
        System.out.println(s.sum((float)1.2, (float)2.5));
        System.out.println(s.sum(5,15));
        System.out.println(s.sum(10,25,68));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;

    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}