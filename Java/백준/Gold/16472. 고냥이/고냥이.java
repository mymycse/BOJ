import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int[] alphabet = new int[26];
        int result = 0;
        int cnt = 0;

        int st = 0;
        for ( int en = 0 ; en < str.length() ; en++ ) {
            if ( alphabet[str.charAt(en)-'a']++ == 0 )
                cnt++;

            while ( N < cnt && st < en ) {
                if ( --alphabet[str.charAt(st)-'a'] == 0 )
                    cnt--;
                
                st++;
            }

            result = Math.max(result, en-st+1);
        }

        System.out.println(result);
    }
}