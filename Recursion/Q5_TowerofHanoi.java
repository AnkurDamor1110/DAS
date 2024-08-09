package Recursion;

public class Q5_TowerofHanoi {

    public static void towerofHanoi(int n, String src,String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofHanoi(n-1,src,dest,helper);
        //transfer nth from src to dest
        System.out.println("Transfer disk "+n+" from "+src+" to "+ helper);
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerofHanoi(n,"S","H","D");
    }
}
