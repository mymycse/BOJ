import java.io.*;
import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void stk(String str){
		Stack<Character> s = new Stack<>();

		for ( int i = 0 ; i < str.length() ; i++ ) {
			char c = str.charAt(i);
			if ( c == '(')
				s.push(c);
			else if ( s.isEmpty() )	{
				s.push(c);
				break;
			} 
			else
				s.pop();
		}
		if ( s.isEmpty() )
			System.out.println("YES");
		else
			System.out.println("NO");
	}
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while ( n-- > 0 ) 
			stk(br.readLine());
		
		br.close();
		System.out.println(sb);
    }
}