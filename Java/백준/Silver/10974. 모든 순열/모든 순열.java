import java.io.*;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] b;
    static void dfs ( int len ) {
        if ( len == N ) {
            for ( int val : arr )
                System.out.print( val + " " );
            System.out.println();
            return;
        }

        for ( int i = 0 ; i < N ; i++ ) {
            if ( !b[i] ) {
                arr[len] = i+1;
                b[i] = true;
                dfs(len+1);
                b[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        b = new boolean[N];

        dfs(0);
    }
}