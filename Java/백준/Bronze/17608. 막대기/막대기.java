import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for ( int i = n-1 ; i >= 0 ; i-- )
            arr[i] = Integer.parseInt(br.readLine());

        int height = arr[0];
        int cnt = 1;

        for ( int i = 1 ; i < n ; i++ )
            if ( arr[i] > height ) {
                cnt++;
                height = arr[i];
            }

        System.out.println(cnt);
    }
}