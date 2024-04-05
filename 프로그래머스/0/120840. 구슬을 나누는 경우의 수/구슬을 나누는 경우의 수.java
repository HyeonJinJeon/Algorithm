class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }
    
    public int combination(int n, int m){
        if( m == 0 || n == m) {
            return 1;
        }else{ 
            return combination(n-1, m-1) 
              + combination(n-1, m);
        }
    }
}
// class Solution {
//     public int solution(int balls, int share) {
//         int answer = 0;
//         answer = fac(balls, share) / fac(share, share);
//         return answer;
//     }
//     public static int fac(int balls, int share){
//         int result = 1;
//         for(int i = 0; i < share; i ++){
//             result *= balls;
//             balls--;
//         }
//         return result;
//     }
// }