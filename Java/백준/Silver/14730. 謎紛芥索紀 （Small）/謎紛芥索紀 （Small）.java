import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while ( n-- > 0 ) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += a*b;
        }

        System.out.println(sum);
    }
}