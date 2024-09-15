import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        StringTokenizer str = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(str.nextToken());
        int P = Integer.parseInt(str.nextToken());

        for ( int i = 0 ; i < 6 ; i++ ) {
            int shirts = Integer.parseInt(st.nextToken());
            if ( shirts != 0 )
                sum += (shirts-1)/T +1;
        }

        System.out.println(sum);

        System.out.println(N/P + " " + N%P);
    }
}
