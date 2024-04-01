class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int result = -1;
        int n = num;
        int length = 0;
        int cnt = 0;
        while(n > 0){
            n = n/10;
            length++;
        }
        while(num>0){
            cnt++;
            if(num%10 == k){
                result = length-cnt+1;
            }
            num /= 10;
        }
        if(result != -1) {
            answer = result;
        }

        return answer;
    }
}
/* 형변환을 해서 푸는 방법 */

// class Solution {
//     public int solution(int num, int k) {
//         int answer = -1;
//         String str = String.valueOf(num);
//         char[] arr = new char[str.length()] ;

//         for(int i=0;i<str.length();i++){
//            arr[i] = str.charAt(i);
//         }
//         for(int i=0;i<arr.length;i++){
//             if((int)arr[i]-'0'==k){
//                 answer=i+1;
//                 break;
//             }
//         }

//         return answer;
//     }
// }