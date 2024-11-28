import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer>[] tree = new List[N+1];
        for ( int i = 1 ; i <= N ; i++ )
            tree[i] = new ArrayList<>();

        for ( int i = 0 ; i < N-1 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        int q = Integer.parseInt(br.readLine());
        for ( int i = 0 ; i < q ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if ( t == 1 )
                if ( tree[k].size() == 1 )
                    System.out.println("no");
                else
                    System.out.println("yes");
            else
                System.out.println("yes");
        }
    }
}