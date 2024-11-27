import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] soda = new int[3];
        for ( int i = 0 ; i < 3 ; i++ )
            soda[i] = Integer.parseInt(st.nextToken());

        int taste = 0;
        for ( int i = 0 ; i < 3 ; i++ )
            if ( soda[i]%2 == 1 )
                if ( taste == 0 )   taste = soda[i];
                else                taste *= soda[i];

        if ( taste == 0 )
            taste = soda[0]*soda[1]*soda[2];

        System.out.println(taste);
    }
}