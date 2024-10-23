import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while ( n-- > 0 ) {
            int[] a = new int[5];
            int[] b = new int[5];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            for ( int i = 0 ; i < cnt ; i++ )
                a[Integer.parseInt(st.nextToken())]++;

            st = new StringTokenizer(br.readLine());
            cnt = Integer.parseInt(st.nextToken());
            for ( int i = 0 ; i < cnt ; i++ )
                b[Integer.parseInt(st.nextToken())]++;

            boolean winner = false;
            for ( int i = 4 ; i > 0 ; i-- ) {
                if ( a[i] == b[i] ) continue;

                if ( a[i] > b[i] )
                    System.out.println('A');
                else
                    System.out.println('B');

                winner = true;
                break;
            }

            if ( !winner )
                System.out.println('D');
        }
    }
}