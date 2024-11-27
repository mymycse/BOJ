import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] items = new int[N][2];
        for ( int i = 0 ; i < N ; i++ ) {
            st = new StringTokenizer(br.readLine());
            items[i][0] = Integer.parseInt(st.nextToken());
            items[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[K+1];

        for ( int i = 0 ; i < N ; i++ )
            for ( int j = K ; j >= items[i][0] ; j-- )
                dp[j] = Math.max(dp[j], dp[j-items[i][0]]+items[i][1]);

        System.out.println(dp[K]);
    }
}