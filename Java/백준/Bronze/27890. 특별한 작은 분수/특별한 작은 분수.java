import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] fountain = new int[N+1];
        fountain[0] = x;

        for ( int i = 1 ; i <= N ; i++ ) {
            if ( fountain[i-1]%2 == 0 )
                fountain[i] = fountain[i-1]/2 ^ 6;
            else 
                fountain[i] = fountain[i-1]*2 ^ 6;
        }

        System.out.println(fountain[N]);
    }
}