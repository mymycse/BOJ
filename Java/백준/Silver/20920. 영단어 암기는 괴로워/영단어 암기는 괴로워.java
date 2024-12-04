import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap <String,Integer> hmap = new HashMap<>();
        for ( int i = 0 ; i < N ; i++ ) {
            String word = br.readLine();

            if ( word.length() < M )    continue;

            if ( hmap.containsKey(word) )
                hmap.replace(word, hmap.get(word)+1);
            else
                hmap.put(word, 1);
        }

        List<String> list = new ArrayList<>(hmap.keySet());
        
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ( hmap.get(o1) == hmap.get(o2) )
                    if ( o1.length() == o2.length() )
                        return o1.compareTo(o2);
                    else
                        return o2.length() - o1.length();
                return hmap.get(o2) - hmap.get(o1);
            }
        });

        for ( String word : list )
            bw.append(word+'\n');

        bw.flush();
        bw.close();
    }
}