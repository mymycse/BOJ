import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while ( T-- > 0 ) {
            String AC = br.readLine();
            int n = Integer.parseInt(br.readLine());

            ArrayDeque<Integer> dq = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");

            for ( int i = 0 ; i < n ; i++ )
                dq.add(Integer.valueOf(st.nextToken()));

            int R = 0;
            boolean error = false;
            for ( char c : AC.toCharArray() ) {

                if ( c == 'R' )
                    R++;
                else {
                    if ( R%2 == 0 ) {
                        if ( dq.pollFirst() == null ) {
                            error = true;
                            sb.append("error\n");
                            break;
                        }
                    } else {
                        if ( dq.pollLast() == null ) {
                            error = true;
                            sb.append("error\n");
                            break;
                        }
                    }
                }
            }

            if ( !error ) {
                sb.append('[');
                while ( !dq.isEmpty() ) {
                    if ( R%2 == 0 ) {
                        sb.append(dq.pollFirst());

                        while ( !dq.isEmpty() )
                            sb.append(',').append(dq.pollFirst());
                    } else {
                        sb.append(dq.pollLast());

                        while ( !dq.isEmpty() )
                            sb.append(',').append(dq.pollLast());
                    }
                }
                sb.append(']').append('\n');
            }
        }

        System.out.println(sb);
    }
}