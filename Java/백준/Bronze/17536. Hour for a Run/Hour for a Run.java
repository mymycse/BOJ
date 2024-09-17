import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int k = V*N;
        int sign = 1;

        for ( int i = 1 ; i < 10 ; i++ ) {
            while ( sign*10/k < i ) {
                sign++;
            }
            
            System.out.print( sign + " " );
        }
    }
}