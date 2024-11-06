import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> answer = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for ( int i = 0 ; i < N ; i++ )
            answer.put(st.nextToken(), i);

        String[] my = new String[N];
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < N ; i++ )
            my[i] = st.nextToken();

        for ( int i = 0 ; i < N ; i++ )
            for ( int j = i+1 ; j < N ; j++ )
                if ( answer.get(my[i]) < answer.get(my[j]) )
                    cnt++;
            
        int b = N*(N-1)/2;

        System.out.println(cnt + "/" + b);
    }
}