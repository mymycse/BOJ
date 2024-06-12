import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		st.nextToken();
		int now = Integer.parseInt(st.nextToken());
		int max = now;

		for ( int i = 0 ; i < 9 ; i++ ) {
			st = new StringTokenizer(br.readLine());
			now -= Integer.parseInt(st.nextToken());
			now += Integer.parseInt(st.nextToken());

			max = Math.max(max,now);
		}

		System.out.println(max);
	}
}