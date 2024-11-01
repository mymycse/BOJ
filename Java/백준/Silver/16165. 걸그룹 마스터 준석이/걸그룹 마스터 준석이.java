import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> t = new HashMap<>();
        HashMap<String, String[]> m = new HashMap<>();
        while ( N-- > 0 ) {
            String team = br.readLine();
            int k = Integer.parseInt(br.readLine());
            String[] list = new String[k];
            for ( int i = 0 ; i < k ; i++ ) {
                String name = br.readLine();
                t.put(name, team);
                list[i] = name;
            }

            Arrays.sort(list);
            m.put(team, list);
        }

        while ( M-- > 0 ) {
            String quiz = br.readLine();
            int q = Integer.parseInt(br.readLine());

            if ( q == 0 ) {
                for ( String s : m.get(quiz) )
                    System.out.println(s);
            } else {
                System.out.println(t.get(quiz));
            }
        }
    }
}