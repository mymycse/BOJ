import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<Integer>();

		while ( n-- > 0 ) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			String st = str.nextToken();

			switch (st) {
				case "push":
					int k = Integer.parseInt(str.nextToken());
					s.push(k);
					break;
				case "pop":
					System.out.println(s.isEmpty() ? -1 : s.pop());
					break;
				case "size":
					System.out.println(s.size());
					break;
				case "empty":
					System.out.println(s.isEmpty() ? 1 : 0);
					break;
				default:
					System.out.println(s.isEmpty() ? -1 : s.peek());
					break;
			}
		}
    }
}