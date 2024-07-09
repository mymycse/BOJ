import java.util.Scanner;

public class Main {
    public static void star ( int n ) {
        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ )
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while ( true ) {
            int n = sc.nextInt();
            if ( n == 0 )
                break;
            star(n);
        }
    }
}