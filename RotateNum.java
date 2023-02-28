import java.util.Scanner;

public class RotateNum {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = rotNum(n);
        System.out.println(ans);
        scn.close();
    }

    public static int rotNum(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}
