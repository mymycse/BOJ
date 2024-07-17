import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            
            while ( x-- > 0 )
                System.out.print(c);
            System.out.println();
        }
    }
}