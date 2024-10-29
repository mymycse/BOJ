import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        while ( n-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if ( state.equals("enter") )
                map.put(name,state);
            else
                map.remove(name);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());

        for ( String name : list )
            System.out.println(name);
    }
}