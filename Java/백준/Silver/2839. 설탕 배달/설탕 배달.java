import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int basket = 0;
		
		while (n > 0) {
			if ( n%5 == 0 ) {
				basket += n/5;
				break;
			} else {
				n -= 3;
				basket++;
			} if (n<0) {
				basket = -1;
			}
		}

		System.out.println(basket);
    }
}