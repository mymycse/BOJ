import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ( a == 0 && b == 0 && c == 0 )
                break;

            if ( b-a == c-b ) {
                System.out.println("AP "+(c*2-b));
            } else {
                System.out.println("GP "+ c*(c/b));
            }
        }
    }
}