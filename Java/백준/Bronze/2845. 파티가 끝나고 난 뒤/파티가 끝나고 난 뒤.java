import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for ( int i = 0 ; i < 5 ; i++ ) {
			int a = Integer.parseInt(st.nextToken());
			System.out.print(a-num + " ");
		}
	}
}