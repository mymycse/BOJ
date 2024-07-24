import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[][] words = new String[n][2];

        for ( int i = 0 ; i < n ; i++ ) {
            st = new StringTokenizer(br.readLine());
            words[i][0] = st.nextToken();
            words[i][1] = st.nextToken();
        }

        Arrays.sort(words, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[]o2) {
                    return o1[0].compareTo(o2[0]);
            }
        });

        while ( m-- > 0 ) {
            String sentence = br.readLine();
            String result = "";

            for ( int i = 0 ; i < sentence.length() ; i++ )
                for ( int j = 0 ; j < n ; j++ )
                    if ( sentence.substring(i).startsWith(words[j][0]))
                        result += words[j][1];

            if ( result.equals("") )
                System.out.println(-1);
            else
                System.out.println(result);
        }
    }
}
