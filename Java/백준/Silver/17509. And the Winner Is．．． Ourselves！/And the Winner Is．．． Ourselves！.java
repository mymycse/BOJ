import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] penalty = new int[11];
        int sum = 0;

        for ( int i = 0 ; i < 11 ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            penalty[i] = d;
            sum += v;
        }

        Arrays.sort(penalty);

        int result = 0;
        int time = 0;

        for ( int i = 0 ; i < 11 ; i++ ) {
            time += penalty[i];
            result += time;
        }

        System.out.println(result + sum*20);
    }
}