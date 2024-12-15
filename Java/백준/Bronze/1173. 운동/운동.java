import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int now = m;
        int time = 0;
        int ex = 0;
        
        if ( M-m < T ) {
            time = -1;
        } else
            while ( true ) {
                if ( ex == N )    break;
                if ( now+T <= M ) {
                    now += T;
                    ex++;
                } else
                    now -= R;

                if ( now < m )
                    now = m;

                time++;
            }

        System.out.println(time);
    }
}