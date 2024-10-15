import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static String[][] sort;
    static void binarySearch(String str) {
        int st = 0;
        int en = N-1;

        while ( true ) {
            int mid = (st+en)/2;

            if ( str.equals(sort[mid][0]) ) {
                System.out.println(sort[mid][1]);
                return;
            }
            
            if ( str.compareTo(sort[mid][0]) > 0 )
                st = mid+1;
            else
                en = mid-1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sort = new String[N][2];
        String[] name = new String[N+1];
        for ( int i = 0 ; i < N ; i++ ) {
            sort[i][0] = br.readLine();
            sort[i][1] = ""+(i+1);
            name[i+1] = sort[i][0];
        }

        Arrays.sort(sort, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].toString().compareTo(o2[0].toString());
            }
        });

        while ( M-- > 0 ) {
            String str = br.readLine();

            if ( str.charAt(0) >= '0' && str.charAt(0) <= '9' ) {
                System.out.println(name[Integer.parseInt(str)]);
                continue;
            }

            binarySearch(str);
        }
    }
}