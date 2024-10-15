import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt = 1;

        for ( int i = 1 ; i < str.length() ; i++ ) 
            if ( str.charAt(i-1) != str.charAt(i) )
                cnt++;

        System.out.println(cnt/2);
    }
}