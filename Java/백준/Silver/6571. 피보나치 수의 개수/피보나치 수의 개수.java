import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger[] dp = new BigInteger[1001];
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("2");

        for ( int i = 3 ; i < 1001 ; i++ )
            dp[i] = dp[i-1].add(dp[i-2]);
        
        while ( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());

            if ( b.compareTo(new BigInteger("0")) == 0 )
                break;

            int cnt = 0;
            for ( int i = 1 ; i < 1001 ; i++ ) 
                if ( a.compareTo(dp[i]) <= 0 && dp[i].compareTo(b) <= 0 )
                    cnt++;
            
            System.out.println(cnt);
        }
    }
}