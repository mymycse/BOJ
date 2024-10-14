import java.io.*;
import java.util.*;

public class Main {
    static long ans;
    static void sum(List<Integer> l) {
        while ( l.size() > 1 ) {
            ans += (long)l.get(l.size()-1) * l.get(l.size()-2);
            l.remove(l.size()-1);
            l.remove(l.size()-1);
        }

        if ( !l.isEmpty() ) ans += l.get(0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ans = 0L;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for ( int i = 0 ; i < N ; i++ ) {
            int k = Integer.parseInt(br.readLine());

            if ( k == 1 )
                ans++;
            else if ( k > 0 )
                pos.add(k);
            else
                neg.add(k);
        }

        Collections.sort(pos);
        Collections.sort(neg, Collections.reverseOrder());

        sum(pos);
        sum(neg);

        System.out.println(ans);
    }
}