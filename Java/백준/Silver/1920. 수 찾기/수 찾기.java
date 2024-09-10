import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int n, m;
    public static void binarySearch ( int target ) {
        int st = 0;
        int en = n-1;

        while ( st <= en ) {
            int mid = (st + en)/2;
            if ( arr[mid] < target )
                st = mid+1;
            else if ( arr[mid] > target )
                en = mid-1;
            else {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i++ )
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < m ; i++ )
            binarySearch(Integer.parseInt(st.nextToken()));
    }
}