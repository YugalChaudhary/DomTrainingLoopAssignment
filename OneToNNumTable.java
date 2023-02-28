import java.util.Scanner;

public class OneToNNumTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= 10 ; j++) {
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        scn.close();
    }    
}
