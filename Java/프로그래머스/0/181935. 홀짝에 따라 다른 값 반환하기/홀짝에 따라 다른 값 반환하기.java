class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if ( n%2 == 0 )
            for ( int i = n/2 ; i > 0; i--)
                answer += i*i*4;
        else
            for ( int i = n/2 ; i >= 0 ; i-- )
                answer += i*2+1;
        
        return answer;
    }
}