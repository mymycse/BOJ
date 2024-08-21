import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        String str = br.readLine();

        while ( true ) {
            if ( str.contains("PS4") )
                str = str.replace("PS4","PS");
            else if ( str.contains("PS5") )
            str = str.replace("PS5","PS");
            else
                break;
        }

        System.out.println(str);
    }
}