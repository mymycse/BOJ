import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int A = 0, B = 0;

        while ( N-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int scoreA = Integer.parseInt(st.nextToken());
            int scoreB = Integer.parseInt(st.nextToken());

            if ( scoreA > scoreB )
                A++;
            else if ( scoreA < scoreB )
                B++;
        }

        System.out.println( A + " " + B );
    }
}