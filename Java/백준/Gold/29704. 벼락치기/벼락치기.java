import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[][] hw = new int[N][2];
        int sum = 0;
        for ( int i = 0 ; i < N ; i++ ) {
            st = new StringTokenizer(br.readLine());
            hw[i][0] = Integer.parseInt(st.nextToken());
            hw[i][1] = Integer.parseInt(st.nextToken());
            sum += hw[i][1];
        }

        int[] dp = new int[T+1];

        for ( int i = 0 ; i < N  ; i++ )
            for ( int j = T ; j >= hw[i][0] ; j-- )
                dp[j] = Math.max(dp[j], dp[j-hw[i][0]]+hw[i][1]);

        System.out.println(sum-dp[T]);
    }
}