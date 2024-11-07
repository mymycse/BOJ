import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k;

        boolean cute = true;
        if ( s.length() > 1 ) {
            k = s.charAt(0)-s.charAt(1);
            for ( int i = 1 ; i < s.length()-1 ; i++ )
                if ( s.charAt(i)-s.charAt(i+1) != k ) {
                    cute = false;
                    break;
                }
        }

        if ( cute )
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        else
            System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
    }
}