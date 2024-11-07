import java.io.*;
import java.util.*;

class HW {
    int time, score;

    HW( int time, int score ) {
        this.time = time;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int totalScore = 0;
        Stack<HW> homework = new Stack<>();

        while ( N-- > 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());

            if ( e == 1 ) {
                int A = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());

                if ( T == 1 )
                    totalScore += A;
                else
                    homework.add(new HW(T-1,A));
            } else if ( !homework.isEmpty() ) {
                HW hw = homework.pop();
                
                if ( hw.time == 1 )
                    totalScore += hw.score;
                else
                    homework.add(new HW(hw.time-1, hw.score));
            }
        }

        System.out.println(totalScore);
    }
}