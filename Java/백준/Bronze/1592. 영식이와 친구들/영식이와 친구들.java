import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] ball = new int[N];
        int cnt = 0;
        int idx = 0;
        ball[idx] = 1;

        while ( true ) {
            if ( ball[idx] == M ) 
                break;

            if ( ball[idx]%2 == 0 ) 
                idx = (idx-L+N)%N;
            else
                idx = (idx+L)%N;

            ball[idx]++;
            cnt++;
        }

        System.out.println(cnt);
    }
}