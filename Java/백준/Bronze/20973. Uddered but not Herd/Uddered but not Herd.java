import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String cow = br.readLine();
        String humming = br.readLine();
        int[] arr = new int[26];

        for ( int i = 0 ; i < cow.length() ; i++ ) {
            char temp = cow.charAt(i);
            arr[temp-'a'] = i;
        }

        int cnt = 1;

        for ( int i = 1 ; i < humming.length() ; i++ ) {
            if ( arr[humming.charAt(i-1)-'a'] >= arr[humming.charAt(i)-'a'] )
                cnt++;
        }

        System.out.println(cnt);
    }
}