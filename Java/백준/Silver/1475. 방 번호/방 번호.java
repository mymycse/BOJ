import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] cnt = new int[10];

		for ( int i = 0 ; i < str.length() ; i++ )
			cnt[str.charAt(i)-'0']++;

		int max = cnt[0];
		int var = 0;
		for ( int i = 0 ; i < 10 ; i++ ) {
			if ( i == 6 || i == 9 )
				var += cnt[i];
			else
				max = Math.max(max,cnt[i]);
		}

		int answer = Math.max((var+1)/2,max);
		System.out.println(answer);
	}
}