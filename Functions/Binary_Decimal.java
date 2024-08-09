package Functions;

public class Binary_Decimal {
    public static void BinaryToDecimal(int binum) {

        int pow = 0;
        int decNum = 0;
        while (binum > 0) {
            int ld = binum % 10;
            decNum = decNum + (ld * (int) Math.pow(2, pow));
            pow++;
            binum /= 10;
        }
        System.out.println("Decimal Number is " + decNum);
    }

    public static void DecimalToBinary(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("Binary Number is " + bin);
    }

    public static void main(String[] args) {
        BinaryToDecimal(111111111);
        DecimalToBinary(511);
    }
}
