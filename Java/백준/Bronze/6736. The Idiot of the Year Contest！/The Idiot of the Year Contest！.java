import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static BigInteger fac ( int n ) {
        if ( n == 0 )
            return BigInteger.ONE;
        return fac(n-1).multiply(new BigInteger( "" + n ));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while ( T-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            char picked = st.nextToken().charAt(0);

            String str = String.valueOf(fac(day));
            int cnt = 0;

            for ( int i = 0 ; i < str.length() ; i++ )
                if ( str.charAt(i) == picked )
                    cnt++;

            System.out.println(cnt);
        }
    }
}