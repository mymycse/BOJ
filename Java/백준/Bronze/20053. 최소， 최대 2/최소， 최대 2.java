import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for ( int i = 0 ; i < n ; i++ ) {
                int x = Integer.parseInt(st.nextToken());
                max = Math.max(x, max);
                min = Math.min(x, min);
            }

            System.out.println(min + " " + max);
        }
    }
}