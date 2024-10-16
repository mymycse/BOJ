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

            if ( (c-a)*b < 0 )
                System.out.println("X");
            else if ( (c-a) % b == 0 )
                System.out.println( (c-a) / b +1 );
            else
                System.out.println("X");
        }
    }
}