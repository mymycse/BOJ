import java.util.Scanner;

public class Main {
	public static int fac(int n) {
		if ( n == 0 )
			return 1;
		return n*fac(n-1);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		System.out.println(fac(n)/fac(k)/fac(n-k));
    }
}