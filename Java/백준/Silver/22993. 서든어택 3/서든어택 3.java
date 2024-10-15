import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long junwon = Integer.parseInt(st.nextToken());
        int[] players = new int[N-1];

        for ( int i = 0 ; i < N-1 ; i++ )
            players[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(players);
        boolean win = true;

        for ( int i = 0 ; i < N-1 ; i++ ) {
            if ( junwon <= players[i] ) {
                win = false;
                break;
            }

            junwon += players[i];

            if ( junwon > players[N-2] )
                break;
        }

        String result = win ? "Yes" : "No";
        System.out.println(result);
    }
}