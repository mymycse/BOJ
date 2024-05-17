import java.util.Scanner;

class Solution {
    public static int solution(int num1, int num2) {
        int answer = num1+num2;
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(solution(sc.nextInt(), sc.nextInt()));
    }
}