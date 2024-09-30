import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] room = new int[N][2];
        for ( int i = 0 ; i < N ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            room[i][0] = Integer.parseInt(st.nextToken());
            room[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if ( o1[1] == o2[1] )
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int cnt = 1;
        int prev = room[0][1];

        for ( int i = 1 ; i < N ; i++ ) 
            if ( room[i][0] >= prev ) {
                cnt++;
                prev = room[i][1];
            }

        System.out.println(cnt);
    }
}