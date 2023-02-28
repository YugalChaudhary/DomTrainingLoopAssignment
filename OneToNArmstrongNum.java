import java.util.Scanner;

public class OneToNArmstrongNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            boolean ans = check(i);
            if (ans) {
                System.out.println(i);
            }
        }
        scn.close();
    }
    public static boolean check(int n) {
        int tmp = n , sum = 0 , len = 0;
        while (tmp != 0) {
            len++;
            tmp /= 10;
        }

        tmp = n;

        while (tmp != 0) {
            int rem = tmp % 10;
            sum += Math.pow(rem, len);
            tmp /= 10;
        }

        return sum == n ? true:false;
    }
}
