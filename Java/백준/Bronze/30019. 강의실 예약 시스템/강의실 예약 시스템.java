import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lastEndTime = new int[N + 1];

        for ( int i = 0 ; i < M ; i++ ) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if ( s >= lastEndTime[k] ) {
                bw.write("YES\n");
                lastEndTime[k] = e;
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}