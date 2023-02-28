import java.util.Scanner;

public class DivBySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = check(n);
        if (n % sum == 0) {
            System.out.println("No. is divisible by its digit");
        }
        else {
            System.out.println("No. is not divisible by its digit");
        }
        scn.close();
    }

    public static int check(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum; 
    }
}
