import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int soei = modifyNum(n);
        if (soei % 9 == 0) {
            System.out.println("It is a Lucky Number");
        }
        else {
            System.out.println("It is not a Lucky Number");
        }
        scn.close();
    }

    public static int modifyNum(int n) {
        int sum = 0 , len = 0 , tmp = n;
        while (tmp != 0) {
            len++;
            tmp /= 10;
        }
        while (n != 0) {
            int rem = n % 10;
            if (len % 2 == 0) {
                sum += rem * rem;
            }
            n /= 10;
            len--;
        }
        return sum;
    }
}
