import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		int k = n;

		while ( true ) {
			int tmp = k/10 + k%10;
			cnt++;
			k %= 10; k *= 10;
			k += tmp%10;

			if ( k == n )
				break;
		}

		System.out.println(cnt);
	}
}