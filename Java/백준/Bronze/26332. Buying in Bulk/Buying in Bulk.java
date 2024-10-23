import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while ( n-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());            

            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            System.out.println( c + " " + p );
            System.out.println(c*p - 2*(c-1));
        }
    }
}