import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] track = new char[n];
        for ( int i = 0 ; i < n ; i++ )
            track[i] = sc.next().charAt(0);
        
        char alice = sc.next().charAt(0);

        int cnt = 0;

        for ( int i = 0 ; i < n ; i++ )
            if ( track[i] == alice )
                cnt++;

        System.out.println(cnt);
    }
}