import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long OFFSET = 1_000_000_007;
    private static long pow ( long b ) {
        if ( b == 0 )
            return 1;
        long res = pow(b/2);
        
        if ( b%2 == 0 )
            return res*res%OFFSET;
        else
            return res*res*2%OFFSET;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long result = 0;
        
        while ( N-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long c = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            if ( k == 0 )
                continue;

            result += ((c*k%OFFSET) * pow(k-1))%OFFSET;
            result %= OFFSET;
        }

        System.out.println(result);
    }
}