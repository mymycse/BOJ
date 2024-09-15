import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int temp = 10_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[20_000_001];
		for ( int i = 0 ; i < n ; i++ )
			arr[Integer.parseInt(st.nextToken())+temp]++;

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[m];
		for ( int i = 0 ; i < m ; i++ )
			arr2[i] = Integer.parseInt(st.nextToken())+temp;

		int[] result = new int[m];
		for ( int i = 0 ; i < m ; i++ )
            result[i] = arr[arr2[i]];

		for ( int k : result )
			System.out.print( k + " " );
	}
}