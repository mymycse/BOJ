import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[][] freq = new int[8001][2];
        int sum = 0;

        for ( int i = 0 ; i < N ; i++ ) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];

            freq[arr[i]+4000][0] = arr[i];
            freq[arr[i]+4000][1]++;
        }
        
        Arrays.sort(arr);
        Arrays.sort(freq, (o1,o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o2[1]-o1[1]);
        int res = freq[0][1] == freq[1][1] ? freq[1][0] : freq[0][0];

        System.out.println((int)Math.round((double)sum/N)); // 산술평균
        System.out.println(arr[N/2]); // 중앙값
        System.out.println(res); // 최빈값
        System.out.println(arr[N-1]-arr[0]); // 범위
    }
}