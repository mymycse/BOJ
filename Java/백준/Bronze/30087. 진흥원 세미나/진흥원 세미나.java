import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] sub = {
            {"Algorithm","204"}, 
            {"DataAnalysis","207"}, 
            {"ArtificialIntelligence","302"}, 
            {"CyberSecurity","B101"}, 
            {"Network","303"}, 
            {"Startup","501"}, 
            {"TestStrategy","105"}
        };

        while ( n-- > 0 ) {
            String subject = br.readLine();

            for ( int i = 0 ; i < 7 ; i++ ) {
                if ( subject.equals(sub[i][0]) ) {
                    System.out.println(sub[i][1]);
                    break;
                }
            }
        }
    }
}