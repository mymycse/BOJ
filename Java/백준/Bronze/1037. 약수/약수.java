import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer str = new StringTokenizer(br.readLine());

		for ( int i = 0 ; i < n ; i++ )
			arr[i] = Integer.parseInt(str.nextToken());

		Arrays.sort(arr);

		if ( n%2 == 0 )
			System.out.println(arr[n/2]*arr[n/2-1]);
		else
			System.out.println(arr[n/2]*arr[n/2]);
	}
}