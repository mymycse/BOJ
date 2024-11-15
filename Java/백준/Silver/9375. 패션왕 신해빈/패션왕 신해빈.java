import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while ( tc-- > 0 ) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> item = new HashMap<>();
            while ( n-- > 0 ) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String wear = st.nextToken();

                if ( !item.containsKey(wear) )
                    item.put(wear, 1);
                else
                    item.replace(wear, item.get(wear)+1);
            }

            int sum = 1;
            for (Integer val : item.values())
                sum *= (val+1);

            System.out.println(sum-1);
        }
    }
}