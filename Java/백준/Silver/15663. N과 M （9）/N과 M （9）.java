import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr, res;
    static boolean[] b;
    static StringBuilder sb = new StringBuilder();
    static void dfs( int v ) {
        if ( v == M ) {
            for ( int val : res )
                sb.append(val).append(' ');
            sb.append('\n');
            return;
        }

        int bf = 0;
        for ( int i = 0 ; i < N ; i++ ) {
            if ( b[i] || bf == arr[i] ) continue;

            b[i] = true;
            res[v] = arr[i];
            bf = arr[i];
            dfs(v+1);
            b[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        res = new int[M];
        b = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }
}