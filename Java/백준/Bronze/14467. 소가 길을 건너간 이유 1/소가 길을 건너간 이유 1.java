import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        int[] cow = new int[11];
        boolean[] exist = new boolean[11];

        while ( n-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int loc = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());

            if ( !exist[loc] ) {
                cow[loc] = dir;
                exist[loc] = true;
            } else {
                if ( cow[loc] != dir ) {
                    cnt++;
                    cow[loc] = dir;
                }
            }
        }

        System.out.println(cnt);
    }
}