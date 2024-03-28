//String 클래스의 toLowerCase()와 toUpperCase()룰 사용할 수도 있다.
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 65 && my_string.charAt(i) <=90){
                //answer = answer + (my_string.charAt(i)+"").toLowerCase();
                answer = answer + (char)(my_string.charAt(i)+32);
            } else if(my_string.charAt(i) >= 97 && my_string.charAt(i) <=122){
                //answer = answer + (my_string.charAt(i)+"").toUpperCase();
                answer = answer + (char)(my_string.charAt(i)-32);
            }
        }
        return answer;
    }
}