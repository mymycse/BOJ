import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Long res = Long.MAX_VALUE;
        int cnt = 0;
        HashMap<Long, Integer> cards = new HashMap<>();

        while ( N-- > 0 ) {
            Long num = Long.valueOf(br.readLine());
            cards.put(num, cards.getOrDefault(num, 0)+1);

            if ( cards.get(num) > cnt ) {
                res = num;
                cnt = cards.get(num);
            } else if ( cards.get(num) == cnt )
                res = Math.min(res,num);

        }

        System.out.println(res);
    }
}