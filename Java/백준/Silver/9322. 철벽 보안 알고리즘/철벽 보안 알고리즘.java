import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int T = Integer.parseInt(br.readLine());
        
		while ( T-- > 0 ) {
            int N = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<>();
			int[] n = new int[N];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				String key = st.nextToken();
				map.put(key, i);
			}
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				String key = st.nextToken();
				n[i]=map.get(key);
			}
			st = new StringTokenizer(br.readLine());
			String res[] = new String[N];
			for(int i=0; i<N; i++) {
				res[n[i]] = st.nextToken();
			}
			for(int i=0; i<N; i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
		}
	}
}