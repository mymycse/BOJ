import java.util.Scanner;

public class Main {
    public static int gcd(int n, int m) {
        if ( n%m == 0 )
            return m;
        return gcd(m, n%m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split(":");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int x = gcd(n, m);

        System.out.println(n/x + ":" + m/x);
    }
}