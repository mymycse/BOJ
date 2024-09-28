import java.io.*;
import java.util.*;

public class Main {
    static int[] arrN;
    static boolean binarySearch ( int target ) {
        int st = 0;
        int en = arrN.length-1;

        while ( st <= en ) {
            int mid = (st+en)/2;

            if ( arrN[mid] == target )
                return true;
            else if ( arrN[mid] < target )
                st = mid+1;
            else
                en = mid-1;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arrN = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < n ; i++ ) 
            arrN[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrN);

        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        StringBuilder result = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < m ; i++ ) 
            arrM[i] = Integer.parseInt(st.nextToken());

        for ( int num : arrM ) {
            if ( binarySearch(num) )
                result.append("1 ");
            else
                result.append("0 ");
        }

        System.out.println(result.toString().trim());
    }
}