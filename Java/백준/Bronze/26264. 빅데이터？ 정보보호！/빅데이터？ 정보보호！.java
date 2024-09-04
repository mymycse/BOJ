import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String survey = br.readLine();

        survey = survey.replaceAll("bigdata", "b");
        survey = survey.replaceAll("security", "s");

        int b = 0;
        int s = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            char c = survey.charAt(i);

            if ( c == 'b' )
                b++;
            else
                s++;
        }

        if ( s > b )
            System.out.println("security!");
        else if ( s < b )
            System.out.println("bigdata?");
        else
            System.out.println("bigdata? security!");
    }
}