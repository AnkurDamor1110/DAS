package TCS;

import java.util.*;
public class T3_SumCubes {
    public static void findCubeSum(int start, int end) {
        int cubeSum = 0;
        for (int i = start; i <= end; i++) {
            cubeSum += Math.pow(i, 3);
        }
        System.out.println(cubeSum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int start = sc.nextInt();
       int end = sc.nextInt();
       findCubeSum(start, end);

       sc.close();

    }
}
