package Oops;

public class Get_set {
    public static void main(String[] args) {
       getSet p1 =new getSet();
       p1.setcolor("bule");
       System.out.println(p1.getcolor());

       p1.settip(5);
       System.out.println(p1.gettip());
    }
}

class getSet{
    private String color ;
    private int tip;

    String getcolor(){
        return this.color;
    }

    void setcolor(String newcolor){
        color =newcolor;
    }
    
    int gettip(){
        return this.tip;
    }

    void settip(int newtip){
        tip =newtip;
    }

}