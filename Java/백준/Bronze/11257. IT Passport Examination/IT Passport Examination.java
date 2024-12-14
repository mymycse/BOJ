import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while ( N-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String pp = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            boolean result = true;

            if ( a < 35*0.3 || b < 25*0.3 || c < 40*0.3 || a+b+c < 55 )
                result = false;
            
            String res = result ? "PASS" : "FAIL";
            System.out.println(pp + " " + (a+b+c) + " " + res);
        }
    }
}