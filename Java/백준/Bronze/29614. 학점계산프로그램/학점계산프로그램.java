import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;
        double sum = 0;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            char c = str.charAt(i);

            if ( c == '+' )
                sum += 0.5;
            else {
                cnt++;
                if ( c == 'A' )
                    sum += 4;
                else if ( c == 'B' )
                    sum += 3;
                else if ( c == 'C' )
                    sum += 2;
                else if ( c == 'D' )
                    sum += 1;
            }
        }

        System.out.printf("%.5f",sum/cnt);
    }
}