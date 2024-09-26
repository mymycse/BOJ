import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long star = 1;

        for ( int i = N ; i > N-5 ; i-- )
            star *= i;

        for ( int i = 2 ; i < 6 ; i++ )
            star /= i;

        System.out.println(star);
        sc.close();
    }
}