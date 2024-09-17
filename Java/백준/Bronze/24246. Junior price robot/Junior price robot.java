import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] prices = new int[n];
        for ( int i = 0 ; i < n ; i++ )
            prices[i] = Integer.parseInt(st.nextToken());

        int score = 0;

        for ( int i = 1 ; i < n ; i++ ) {
            if ( prices[i] <= prices[0] ) {
                score = i;
                break;
            }
        }

        System.out.println( score == 0 ? "infinity" : score );
    }
}