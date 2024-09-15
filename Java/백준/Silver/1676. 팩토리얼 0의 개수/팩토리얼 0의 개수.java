import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        BigInteger fac = new BigInteger("1");

        for ( int i = 1 ; i <= N ; i++ )
            fac = fac.multiply(BigInteger.valueOf(i));

        String str = fac.toString();
        int cnt = 0;

        for ( int i = str.length()-1 ; i >= 0 ; i-- ) {
            if ( str.charAt(i) == '0' )
                cnt++;
            else
                break;
        }

        System.out.println(cnt);
    }
}