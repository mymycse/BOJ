import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        while ( true ) {
            int k = Integer.parseInt(br.readLine());

            if ( k == -1 )
                break;
            if ( k == 0 )
                q.remove();
            else if ( q.size() < N )
                q.add(k);
        }
        
        if ( q.isEmpty() )
            System.out.println("empty");
        else
            while ( !q.isEmpty() )
                System.out.print( q.poll() + " " );
    }
}