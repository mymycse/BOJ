class Solution {
    public int gcd(int a, int b) {
        if ( a % b == 0 )
            return b;
        return gcd(b, a%b);
    }
    public int solution(int n) {
        return n/gcd(6,n);
    }
}