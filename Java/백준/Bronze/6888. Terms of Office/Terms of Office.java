import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        while ( X <= Y ) {
            q.add(X);
            X += 60;
        }

        while ( !q.isEmpty() )
            System.out.println("All positions change in year "+q.poll());
    }
}