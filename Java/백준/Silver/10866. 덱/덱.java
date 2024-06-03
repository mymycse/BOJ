import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> dq = new LinkedList<Integer>();
		int t = Integer.parseInt(br.readLine());

		while ( t-- > 0 ) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
				case "push_back":
					dq.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "push_front":
					dq.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case "front":
					System.out.println(dq.isEmpty() ? -1 : dq.peekFirst() );
					break;
				case "back":
					System.out.println(dq.isEmpty() ? -1 : dq.peekLast() );
					break;
				case "size":
					System.out.println(dq.size());
					break;
				case "empty":
					System.out.println(dq.isEmpty() ? 1 : 0 );
					break;
				case "pop_front":
					System.out.println(dq.isEmpty() ? -1 : dq.pollFirst() );
					break;
				case "pop_back":
					System.out.println(dq.isEmpty() ? -1 : dq.pollLast() );
					break;
			}
		}
	}
}