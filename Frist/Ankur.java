package Frist;
// import java.util.Scanner;
import java.util.*;
public class Ankur {

  public static int maxNum(ArrayList<Integer> list){
    int max=Integer.MIN_VALUE;

    for(int i=0;i<list.size();i++){
      if(max < list.get(i)){
        max = list.get(i);
      }
    }

    return max;
  }
  
  public static void swapNum(ArrayList<Integer> list, int idx1,int idx2){
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }
public static void main(String[] args) {
 /* Scanner sc= new Scanner(System.in);
  System.out.println("Enter number you want to table");
  int n= sc.nextInt();
  for(int i=1;i<=10;i++){
    System.out.print(n);
    System.out.print(" x ");
    System.out.print(i);
    System.out.print(" = ");
    System.out.println(n*i );
  }
  sc.close();
*/
//  int num[]={1,5,6,7,8};
//  System.out.println(num.length-1);



ArrayList<Integer> list = new ArrayList<>();
list.add(5);
list.add(78);
list.add(65);
list.add(89);
list.add(55);
System.out.println(maxNum(list));
System.out.println(list);
int idx1=1,idx2=3;
swapNum(list, idx1, idx2);

System.out.println(list);
}

}
