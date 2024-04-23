class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = 0;
        if(n > m){
            min = gcd(n,m);
        }else {
            min = gcd(m,n);
        }
        int max = (n/min) * min * (m/min);
        answer[0] = min;
        answer[1] = max;
        return answer;
    }
    
    public static int gcd(int n, int m){
        if(m == 0){
            return n;
        }else {
            return gcd(m, n%m);
        }
    }
}
