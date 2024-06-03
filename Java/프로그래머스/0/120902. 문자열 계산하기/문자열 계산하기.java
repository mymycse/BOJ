class Solution {
    public int solution(String my_string) {
        String[] math = my_string.split(" ");
        int answer = Integer.parseInt(math[0]);
        
        for ( int i = 1 ; i < math.length ; i += 2 ) {
            int a = Integer.parseInt(math[i+1]);
            switch(math[i]) {
                case "+":
                    answer += a;
                    break;
                case "-":
                    answer -= a;
                    break;
            }
        }
        
        return answer;
    }
}