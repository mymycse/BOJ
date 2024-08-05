import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        StringTokenizer str = new StringTokenizer(br.readLine());
        int cnt = 0;

        while ( n-- > 0 ) {
            int min = Integer.parseInt(str.nextToken());
            if ( h >= min )
                cnt++;
        }

        System.out.println(cnt);
    }
}