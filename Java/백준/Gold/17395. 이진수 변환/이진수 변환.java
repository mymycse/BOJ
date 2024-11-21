import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        if ( Long.bitCount(x) < n )
            System.out.println(-1);
        else {
            int temp = Long.bitCount(x) - n + 1;
            for ( int i = 0 ; i < temp ; i++ ) 
                x -= ( x & -x );
            
            System.out.print(x + " ");

            while ( x > 0 ) {
                x -= ( x & -x );
                System.out.print( x + " ");
            }
        }
    }
}