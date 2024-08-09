package Frist;

/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
 
        Scanner key = new Scanner(System.in);
        int t = key.nextInt();
        for(int b=0;b<t;b++){
            int n = key.nextInt();
            int[] a = new int[n];
            String[] s = new String[n];
            for(int i=0;i<n;i++){
                a[i] = key.nextInt();
                s[i] = "";
            }
            boolean  existLeft = false, existRight = false;
            int j,k;
            int li=0, ri=0;
            System.out.print("-1 ");
            for(int i=1;i<n-1;i++){
                existLeft = false;
                existRight = false;
                li=0;
                ri=0;
                for(j=i-1;j>=0;j--){
                    if(a[j]<a[i]){
                        existLeft = true;
                        break;    
                    }
                    else
                        li++;
                }
                for(k=i+1;k<n;k++){
                    if(a[k]<a[i]){
                        existRight = true;
                        break;    
                    }
                    else
                        ri++;
                }
                if(existLeft && existRight)
                    System.out.print((li+ri)+" ");
                else
                    System.out.print("-1 ");
            }
            if(n>1)
                System.out.println("-1 ");
        }
        key.close();
    }
}
