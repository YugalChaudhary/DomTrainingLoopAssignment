import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        digPrint(n);
        scn.close();
    }

    public static void digPrint(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        while (rev != 0) {
            System.out.println(rev%10);
            rev /= 10;
        }
    }
}
