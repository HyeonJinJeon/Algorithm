class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(" ")){
                answer += " ";
                cnt = -1;
            }else {
                if(cnt % 2 == 0){
                    answer += arr[i].toUpperCase();
                }else {
                    answer += arr[i].toLowerCase();
                }
            }
            cnt++;
        }
        return answer;
    }
}