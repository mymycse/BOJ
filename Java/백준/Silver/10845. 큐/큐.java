import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<Integer>();
		int t = Integer.parseInt(br.readLine());
		int last = 0;

		while ( t-- > 0 ) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
				case "push":
					last = Integer.parseInt(st.nextToken());
					q.add(last);
					break;
				case "pop":
					System.out.println(q.isEmpty() ? -1 : q.poll() );
					break;
				case "size":
					System.out.println(q.size());
					break;
				case "empty":
					System.out.println(q.isEmpty() ? 1 : 0 );
					break;
				case "front":
					System.out.println(q.isEmpty() ? -1 : q.peek() );
					break;
				case "back":
					System.out.println(q.isEmpty() ? -1 : last );
					break;
			}
		}
	}
}