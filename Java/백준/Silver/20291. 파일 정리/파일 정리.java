import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> files = new HashMap<>();
        
        while ( N-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine(),".");
            st.nextToken();
            String file = st.nextToken();

            files.put(file, files.getOrDefault(file, 0)+1);
        }

        ArrayList<String> list = new ArrayList<>(files.keySet());
        Collections.sort(list);

        for ( String name : list )
            System.out.println(name + " " + files.get(name));
    }
}