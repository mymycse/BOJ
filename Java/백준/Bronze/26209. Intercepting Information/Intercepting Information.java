import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean read = true;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while ( st.hasMoreTokens() ) {
            int bit = Integer.parseInt(st.nextToken());
            if ( bit == 9 ) {
                read = false;
                break;
            }
        }
        
        System.out.println(read?"S":"F");
    }
}