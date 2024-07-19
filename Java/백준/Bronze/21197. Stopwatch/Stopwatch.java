import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if ( n%2 == 1 )
            System.out.println("still running");
        else {
            int cnt = 0;
            for ( int i = 0 ; i < n/2 ; i++ ) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                cnt += end - start;
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}