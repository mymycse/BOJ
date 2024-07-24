import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            String str = br.readLine();
            int len = str.length();
            String result = "";

            for (int i = len-1 ; i >= 0 ; i-- )
                result += str.charAt(i);

            System.out.println(result);
        }
    }
}