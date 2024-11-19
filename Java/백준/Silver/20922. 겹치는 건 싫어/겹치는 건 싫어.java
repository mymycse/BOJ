import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());

        int[] arr = new int[N];
        stk = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            arr[i] = Integer.parseInt(stk.nextToken());

        int[] num = new int[100_001];
        int st = 0;
        int res = 0;
        for ( int en = 0 ; en < N ; en++ ) {
            num[arr[en]]++;
            if ( num[arr[en]] > K ) {
                while ( num[arr[en]] > K && st < en ) {
                    num[arr[st++]]--;
                }
            }

            res = Math.max(res, en-st+1);
        }

        System.out.println(res);
    }
}