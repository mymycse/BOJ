import java.io.*;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;

        int px = 0;
        int py = -1;
        int dir = 0;

        while ( N-- > 0 ) {
            String input = br.readLine();
            int temp = dir;

            if ( input.length() == 1 ) {
                switch ( input ) {
                    case "A":
                        temp = (temp+3)%4;
                        break;
                    case "S":
                        temp = (temp+2)%4;
                        break;
                    case "D":
                        temp = (temp+1)%4;
                        break;
                }

                x += dx[temp];   y += dy[temp];
                px += dx[temp]; py += dy[temp];
            } else {
                if ( input.charAt(1) == 'R' ) {
                    px = px + dx[dir] + dx[(dir+3)%4];
                    py = py + dy[dir] + dy[(dir+3)%4];
                    dir = (dir+1)%4;
                }
                else {
                    px = px + dx[dir] + dx[(dir+1)%4];
                    py = py + dy[dir] + dy[(dir+1)%4];
                    dir = (dir+3)%4;
                }
            }

            System.out.println( x + " " + y + " " + px + " " + py );
        }
    }
}