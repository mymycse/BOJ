import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] b;
    static void bfs(int st, int d) {
        if ( d == M ) {
            for ( int a : arr )
                System.out.print(a + " ");
            System.out.println();
            return;
        }

        for ( int i = st ; i < N ; i++ ) {
            if ( !b[i] ) {
                arr[d] = i+1;
                b[i] = true;
                bfs(i+1,d+1);
                b[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());
        N = Integer.parseInt(str.nextToken());
        M = Integer.parseInt(str.nextToken());

        arr = new int[M];
        b = new boolean[N];

        bfs(0,0);
    }
}