class Solution {
    public double fac(int n) {
        if ( n == 1 )
            return 1;
        return n*fac(n-1);
    }
    public int solution(int balls, int share) {
        if ( balls <= share )
            return 1;
        else
            return (int)(fac(balls)/fac(balls-share)/fac(share));
    }
}