import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] b;
    static int N, M;
    static void dfs(int d) {
        if ( d == M ) {
            for ( int a : arr )
                System.out.print( a + " " );
            System.out.println();
            return;
        }

        for ( int i = 0 ; i < N ; i++ ) {
            if ( !b[i] ) {
                arr[d] = i+1;
                b[i] = true;
                dfs(d+1);
                b[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[M];
        b = new boolean[N];

        dfs(0);
    }
}