import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger fac ( int n ) {
        if ( n == 1 )
            return BigInteger.valueOf(1);
        return fac(n-1).multiply(BigInteger.valueOf(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger a = fac(n);
        BigInteger b = fac(n/2);
        BigInteger c = BigDecimal.valueOf(Math.pow(2,n/2)).toBigInteger();

        BigInteger result = a.divide(b.multiply(c));

        System.out.println(result);
    }
}
