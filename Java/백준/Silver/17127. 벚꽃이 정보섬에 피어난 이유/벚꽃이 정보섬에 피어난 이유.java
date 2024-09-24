import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] tree = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        tree[0] = 1;
        for ( int i = 1 ; i <= N ; i++ )
            tree[i] = tree[i-1]*Integer.parseInt(st.nextToken());
        
        int max = 0;
        for ( int a = 1 ; a < N ; a++ )
            for ( int b = a+1 ; b < N ; b++ )
                for ( int c = b+1 ; c < N ; c++ ) {
                    int sum = tree[a];
                    sum += tree[b]/tree[a];
                    sum += tree[c]/tree[b];
                    sum += tree[N]/tree[c];

                    max = Math.max(max,sum);
                }

        System.out.println(max);
    }
}