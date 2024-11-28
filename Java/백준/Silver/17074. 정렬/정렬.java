import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int idx = -1;

        for ( int i = 0 ; i < N-1 ; i++ ) {
            if ( arr[i] <= arr[i+1] )
                continue;

            cnt++;
            idx = i;
            if ( cnt == 2 )
                break;
        }

        if ( cnt == 0 )
            System.out.println(N);
        else if ( cnt == 1 ) {
            if ( idx == N-2 )
                if ( arr[idx-1] <= arr[idx+1] )
                    System.out.println(2);
                else
                    System.out.println(1);
            else if ( idx == 0 )
                if ( arr[idx+1] <= arr[idx+2] && arr[idx] <= arr[idx+2] )
                    System.out.println(2);
                else
                    System.out.println(1);
            else
                if ( arr[idx-1] <= arr[idx+1] && arr[idx] <= arr[idx+2] )
                    System.out.println(2);
                else if ( arr[idx-1] <= arr[idx+1] || arr[idx] <= arr[idx+2] )
                    System.out.println(1);
                else
                    System.out.println(0);
        } else 
            System.out.println(0);
    }
}