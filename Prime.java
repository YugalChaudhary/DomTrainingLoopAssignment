import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        boolean ans = checkPrime(n);
        
        if (ans) {
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
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
