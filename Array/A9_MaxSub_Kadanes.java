package Array;

public class A9_MaxSub_Kadanes {

    public static void SubKadanes(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        boolean allNagativ = true;

        for (int i = 0; i < num.length; i++) {

            cs += num[i];
            if( num[i] >=0){
                allNagativ = false;
            }
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }

        if(allNagativ){
            ms = num[0];
            for(int i=1;i<num.length;i++){
                ms = Math.max(ms, num[i]);
            }
        }

        System.out.println(ms);

        /*
         * for(int i=0;i<num.length;i++){
         * cs+=num[i];
         * if(cs<0){
         * cs=0;
         * }
         * ms=Math.max(cs, ms);
         * }
         */

    }

    public static void main(String[] args) {
        int num[] = {0};
        SubKadanes(num);
    }
}
