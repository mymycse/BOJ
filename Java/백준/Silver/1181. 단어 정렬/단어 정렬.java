import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for ( int i = 0 ; i < n ; i++ )
            words[i] = br.readLine();

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ( o1.length() == o2.length() )
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        System.out.println(words[0]);
        int prev = 0;
        
        for ( int i = 1 ; i < n ; i++ ) {
            if ( !words[prev].equals(words[i]) ) {
                System.out.println(words[i]);
                prev = i;
            }
        }
    }
}