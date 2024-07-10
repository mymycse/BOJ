import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] menu = new int[n+1];

        for ( int i = 1 ; i <= n ; i++ )
            menu[i] = sc.nextInt();
        
        int std = sc.nextInt();
        int total = 0;

        while ( std-- > 0 ) {
            int num = sc.nextInt();
            total += menu[num];
        }

        System.out.println(total);
        sc.close();
    }
}