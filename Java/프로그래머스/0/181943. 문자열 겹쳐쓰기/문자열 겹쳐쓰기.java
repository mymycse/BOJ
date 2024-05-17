import java.util.Scanner;

class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0,s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length());
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();
        
        System.out.println(solution(my_string, overwrite_string, s));
    }
}