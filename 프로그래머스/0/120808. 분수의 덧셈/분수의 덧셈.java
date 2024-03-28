class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcd = 0;
        if(denom1 > denom2){
            gcd = calGcd(denom1, denom2);
        } else{
            gcd = calGcd(denom2, denom1);
        }
        int denom = (denom1 * denom2) / gcd;
        numer1 = numer1 * (denom / denom1);
        numer2 = numer2 * (denom / denom2);
        int numer = numer1 + numer2;
        if(denom > numer){
            gcd = calGcd(denom, numer);            
        } else {
            gcd = calGcd(numer, denom);
        }
        answer[0] = numer / gcd;
        answer[1] = denom / gcd;
        
        return answer;
    }
    public int calGcd(int x, int y) {
        if (y == 0)
            return x; // 기저 조건: y가 0이면 x가 최대공약수
        else
            return calGcd(y, x % y); // 유클리드 호제법을 사용한 재귀 호출
    }
}
