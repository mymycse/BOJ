import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> set = new HashSet<String>();
        boolean duplicate = false;
        while ( st.hasMoreTokens() ) {
            String temp = st.nextToken();
            if ( set.contains(temp) ) {
                duplicate = true;
                System.out.println("no");
                break;
            }
            set.add(temp);
        }

        if ( !duplicate )
            System.out.println("yes");
    }
}