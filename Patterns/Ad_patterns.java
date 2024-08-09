package Patterns;

public class Ad_patterns {
    public static void Hollow_Rectangle(int row, int colam) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= colam; j++) {
                // now cell- (i,j)
                if (i == 1 || i == row || j == 1 || j == colam) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Inverted_Rotated_half_pyramid(int n){
        //outer loop 
        for (int i=1 ; i<=n ;i++){
            
            // Inner loops
            //space 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // starts 

            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void iverted_Rotated_half_pyramid_with_number(int n){
        //outer loop 
        for(int i=1;i<=n;i++){
            //inner loop 
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n){
        int counter =1;
        //outer loop 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n ){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n){

        //1th half 
         for(int i=1;i<=n;i++){
            //satrs 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space 
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //satrs
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
         }

         //2nd half 
         for(int i=n;i>=1;i--){
             //satrs 
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space 
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //satrs
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
         }
    }
    public static void main(String[] args) {

        // 1. // Hollow_Rectangle(4, 5);
       //  2. // Inverted_Rotated_half_pyramid(4);
       //  3. // iverted_Rotated_half_pyramid_with_number(5);
       //  4.  // floyds_triangle(5);
       //  5.  // zero_one_triangle(5);
       butterfly_pattern(20);
    }
}
