import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while ( t-- > 0 ) {
            String str = br.readLine();
            int cnt = 1;
            for ( int i = 1 ; i < str.length() ; i++ ) {
                if ( str.charAt(i-1) <= str.charAt(i) )
                    cnt++;
                else
                    break;
            }

            if ( cnt == str.length() ) {
                System.out.println(str);
                continue;
            }

            String result = str.substring(0,cnt+1);
            char prev = str.charAt(cnt);

            for ( int i = cnt+1 ; i < str.length() ; i++ ) {
                if ( prev >= str.charAt(i) ) {
                    result += str.charAt(i);
                    prev = str.charAt(i);
                } else {
                    for ( int j = i ; j < str.length() ; j++ )
                        result += prev;
                    break;
                }
            }

            System.out.println(result);
        }
    }
}