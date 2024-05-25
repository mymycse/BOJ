import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static int fac(int n) {
        if ( n == 0 )
            return 0;
		if ( n == 1 )
			return 1;

        return fac(n-2)+fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BigInteger[] dp = new BigInteger[n+2];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;

		if ( n == 0 ) {
			System.out.println(0);
		} else if ( n == 1 ) {
			System.out.println(1);
		} else {
			for ( int i = 2 ; i <= n ; i++ )
				dp[i] = dp[i-1].add(dp[i-2]);
			System.out.println(dp[n]);
		}
		sc.close();
    }
}