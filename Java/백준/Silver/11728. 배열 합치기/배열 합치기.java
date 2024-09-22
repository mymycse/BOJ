import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aLen = Integer.parseInt(st.nextToken());
        int bLen = Integer.parseInt(st.nextToken());

        int[] A = new int[aLen];
        int[] B = new int[bLen];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < aLen ; i++ )
            A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for ( int i = 0 ; i < bLen ; i++ )
            B[i] = Integer.parseInt(st.nextToken());

        int pointA = 0;
        int pointB = 0;

        for ( int i = 0 ; i < aLen+bLen ; i++ ) {
            boolean aTurn = false;
            if ( pointA == aLen )
                aTurn = false;
            else if ( pointB == bLen )
                aTurn = true;
            else 
                aTurn = A[pointA] < B[pointB];

            if ( aTurn ) {
                bw.write(String.valueOf(A[pointA])+" ");
                pointA++;
            } else {
                bw.write(String.valueOf(B[pointB])+" ");
                pointB++;
            }
        }

        bw.flush();
        bw.close();
    }
}