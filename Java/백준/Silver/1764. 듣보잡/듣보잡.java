import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] a = new String[N];
        String[] b = new String[M];

        for ( int i = 0 ; i < N ; i++ )
            a[i] = br.readLine();

        for ( int i = 0 ; i < M ; i++ )
            b[i] = br.readLine();

        Arrays.sort(a);
        Arrays.sort(b);

        int s = 0;
        int e = 0;
        Queue<String> name = new LinkedList<>();

        while ( s < N && e < M ) {
            if ( a[s].equals(b[e]) ) {
                name.add(a[s]);
                s++;
                e++;
                continue;
            }

            if ( a[s].compareTo(b[e]) < 0 )
                s++;
            else
                e++;
        }

        System.out.println(name.size());
        while ( !name.isEmpty() )
            System.out.println(name.poll());
    }
}