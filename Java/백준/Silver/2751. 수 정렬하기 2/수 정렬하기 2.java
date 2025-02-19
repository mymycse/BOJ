import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();

		for ( int i = 0 ; i < t ; i++ ) 
			arr.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(arr);

		StringBuilder sb = new StringBuilder();

		for ( int val : arr ) 
			sb.append(val + "\n");
		
		System.out.println(sb);
    }
}