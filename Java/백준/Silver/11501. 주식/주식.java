import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while ( T-- > 0 ) {
            int N = Integer.parseInt(br.readLine());

            int[] price = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int i = 0 ; i < N ; i++ )
                price[i] = Integer.parseInt(st.nextToken());

            int max = price[N-1];
            long res = 0;

            for ( int i = N-1 ; i >= 0 ; i-- ) {
                if ( price[i] > max )
                    max = price[i];
                res += max-price[i];
            }

            System.out.println(res);
        }
    }
}