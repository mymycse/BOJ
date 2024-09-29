import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dart = new int[20];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < 20 ; i++ )
            dart[i] = Integer.parseInt(st.nextToken());

        double alice = 20;

        for ( int i = 0 ; i < 20 ; i++ ) {
            int n = dart[i];

            if ( n == 20 ) {
                if ( i == 0 )
                    alice += dart[19];
                else 
                    alice += dart[i-1];

                if ( i == 19 )
                    alice += dart[0];
                else
                    alice += dart[i+1];
                break;
            }
        }
        double bob = 10.5;
        alice /= 3;

        if ( bob == alice )
            System.out.println("Tie");
        else if ( bob > alice )
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }
}