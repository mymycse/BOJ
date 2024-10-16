import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] pc = new boolean[101];

        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while ( N-- > 0 ) {
            int k = Integer.parseInt(st.nextToken());

            if ( pc[k] )
                cnt++;
            else
                pc[k] = true;
        }

        System.out.println(cnt);
    }
}