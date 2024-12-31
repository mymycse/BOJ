import java.io.*;
import java.util.*;

public class Main {
    static boolean surprisingString(String str) {
        int len = str.length();
        
        for ( int i = 1 ; i < len-1 ; i++ ) {
            Set<String> set = new HashSet<>();

            for ( int j = 0 ; j < len-i ; j++ ) {
                String tempStr = ""+str.charAt(j)+str.charAt(j+i);
                if ( !set.add(tempStr) )
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ( true ) {
            String str = br.readLine();
            if ( str.equals("*") )
                break;

            if ( surprisingString(str) )
                System.out.println( str + " is surprising." );
            else
                System.out.println( str + " is NOT surprising." );
        }
    }
}