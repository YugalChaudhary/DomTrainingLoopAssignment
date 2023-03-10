import java.util.Scanner;

public class OneToNPrimeNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            boolean ans = checkPrime(i);
            if (ans) {
                System.out.println(i);
            }
        }
        scn.close();
    }
    public static boolean checkPrime(int n) {
        for (int i = 2 ; i * i <= n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
