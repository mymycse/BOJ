import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while ( true ) {
            if ( a == b )
                break;
            if ( a > b ) {
                if ( a%2 == 1 )
                    a++;
                else
                    a /= 2;
            } else  {
                a++;
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}