import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> hp = new HashSet<>();

        for ( int i = 0 ; i < str.length() ; i++ ) {
            for ( int j = i+1 ; j <= str.length() ; j++ ) {
                String temp = str.substring(i,j);
                if ( hp.contains(temp) )
                    continue;
                hp.add(temp);
            }
        }

        System.out.println(hp.size());
    }
}