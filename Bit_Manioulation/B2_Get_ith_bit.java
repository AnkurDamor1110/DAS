package Bit_Manioulation;

public class B2_Get_ith_bit {
    public static int GetBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        return 1;
    }
    public static int SetBit(int n,int i){
        int bitmask=1<<i;
        
        return n | bitmask;
    }

    public static int ClearBit(int n,int i){
        int bitmask=~(1<<i);
        
        return n & bitmask;
    }

    public static int updateBit(int n,int i,int newbit){
      
        n=ClearBit(n, i);   // without call SetBit function
        int bitmask=newbit << i;
        return n | bitmask;
        
    }
       
    public static int clearLastBit(int n,int i){
      
         
        int bitmask= (~0 )<< i;
        return n & bitmask;
        
    }
    public static int clearRangeBit(int n,int i,int j){
      
         int a =(~0) << j+1;
         int b=(1<<i)-1;
         int bitmask = a|b;
         return n & bitmask;
        
        
    }
    public static boolean isPower2(int n){
      
        
        return( n & n-1) == 0;
        
    }
    


    public static void main(String[] args) {
      // System.out.println( GetBit(10, 2));
      //  System.out.println(GetBit(100, 5));
      //System.out.println(SetBit(10, 2));
      //System.out.println(ClearBit(10, 1));
     // System.out.println(updateBit(10, 2, 1));
     // System.out.println(clearLastBit(15, 2));
    // System.out.println(clearRangeBit(10, 2, 4));
    System.out.println(isPower2(50));
        
    }
}
