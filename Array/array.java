package Array;

public class array {
    public static void update(int mark[]){
        for(int i=0;i<mark.length;i++){
            mark[i]+=1;
        }

    }
    public static void main(String[] args) {
        int mark[]={97,95,90};
        
        update(mark);
        for(int i=0;i<mark.length;i++){
             System.out.print(mark[i]+" ");
        }
        
    }
}
