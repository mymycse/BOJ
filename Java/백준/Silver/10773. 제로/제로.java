import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		Stack<Integer> s = new Stack<>();

		while ( n-- > 0 ) {
			int k = Integer.parseInt(bf.readLine());
			if ( k == 0 )
				s.pop();
			else
				s.push(k);
		}

		int sum = 0;

		for ( int x : s )
			sum += x;
		
		System.out.println(sum);
    }
}