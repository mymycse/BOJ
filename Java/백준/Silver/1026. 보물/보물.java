import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        int res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        for ( int i = 0 ; i < N ; i++ ) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        for ( int i = 0 ; i < N ; i++ )
            res += A[i]*B[N-i-1];

        System.out.println(res);
    }
}