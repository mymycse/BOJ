import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static void dfs ( int len ) {
        if ( len == M ) {
            for ( int val : arr )
                sb.append(val).append(' ');
            sb.append("\n");
            return;
        }

        for ( int i = 0 ; i < N ; i++ ) {
            arr[len] = i+1;
            dfs(len+1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(0);

        System.out.println(sb);
    }
}