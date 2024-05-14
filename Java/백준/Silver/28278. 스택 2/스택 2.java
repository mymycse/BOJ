import java.io.*;
import java.util.*;

public class Main {
	static Stack<Integer> s = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	public static void stk(String str){
		char c = str.charAt(0);

		switch (c) {
			case '1':
				s.push(Integer.parseInt(str.substring(2)));
				return;
			case '2':
				sb.append(s.isEmpty() ? -1 : s.pop()).append("\n");
				return;
			case '3':
				sb.append(s.size()).append("\n");
				return;
			case '4':
				sb.append(s.isEmpty() ? 1 : 0 ).append("\n");
				return;
			case '5':
				sb.append(s.isEmpty() ? -1 : s.peek()).append("\n");
				return;
			default:
				break;
		}
	}
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while ( n-- > 0 ) {
			stk(br.readLine());
		}

		br.close();
		System.out.println(sb);
    }
}