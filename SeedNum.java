import java.util.Scanner;

public class SeedNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int finalNum = modifyNum(n1);
        if (n2 == finalNum) {
            System.out.println("It is a seed no.");
        }
        else {
            System.out.println("It is not a seed no.");
        }
        scn.close();
    }

    public static int modifyNum(int n) {
        int prod = n;
        while (n != 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
}
