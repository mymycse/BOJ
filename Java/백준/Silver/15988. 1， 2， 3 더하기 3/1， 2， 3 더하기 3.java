import java.io.*;

public class Main {
    static long[] memo = new long[1_000_001];
    static int OFFSET = 1_000_000_009;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        for ( int i = 4 ; i < 1_000_001 ; i++ ) 
            memo[i] = (memo[i-1]+memo[i-2]+memo[i-3])%OFFSET;

        while ( T-- > 0 ) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(memo[k]);
        }
    }
}