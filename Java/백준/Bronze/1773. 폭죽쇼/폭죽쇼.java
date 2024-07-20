import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        boolean[] firework = new boolean[c+1];

        while ( n-- > 0 ) {
            int cycle = sc.nextInt();

            for ( int i = cycle ; i <= c ; i += cycle )
                firework[i] = true;
        }

        int cnt = 0;

        for ( int i = 1 ; i <= c ; i++ )
            if ( firework[i] )
                cnt++;

        System.out.println(cnt);

        sc.close();
    }
}