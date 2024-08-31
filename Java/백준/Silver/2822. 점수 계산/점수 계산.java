import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][2];

        for ( int i = 1 ; i <= 8 ; i++ ) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i;
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o2[0] - o1[0];
        });

        int result = 0;
        int[] res = new int[5];

        for ( int i = 0 ; i < 5 ; i++ ) {
            result += arr[i][0];
            res[i] = arr[i][1];
        }

        Arrays.sort(res);

        System.out.println(result);
        for ( int q : res )
            System.out.print( q + " ");
    }
}