class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < t * m - (m - p); i++){
            //A부터 F까지 대문자로 출력하기 위해 toUpperCase()사용
            String num = Integer.toString(i,n).toUpperCase();
            sb.append(num);
        }
        for(int i = p-1; i < t * m - (m - p); i+=m){
            answer += sb.charAt(i);
        }

        return answer;
    }
}