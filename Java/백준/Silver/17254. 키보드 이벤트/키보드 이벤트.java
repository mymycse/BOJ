import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] key = new int[m][3];
        String[] word = new String[m];

        for ( int i = 0 ; i < m ; i++ ) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            key[i][1] = Integer.parseInt(str.nextToken());
            key[i][0] = Integer.parseInt(str.nextToken());
            key[i][2] = i;

            word[i] = str.nextToken();
        }

        Arrays.sort(key, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });

        for ( int i = 0 ; i < m ; i++ ) {
            System.out.print(word[key[i][2]]);
        }
    }
}
