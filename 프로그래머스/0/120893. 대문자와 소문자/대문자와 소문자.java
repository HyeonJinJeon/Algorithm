class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 65 && my_string.charAt(i) <=90){
                answer = answer + (my_string.charAt(i)+"").toLowerCase();
            } else if(my_string.charAt(i) >= 97 && my_string.charAt(i) <=122){
                answer = answer + (my_string.charAt(i)+"").toUpperCase();
            }
        }
        return answer;
    }
}