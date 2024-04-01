class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
        int cnt = 97;
        String[] morese = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                           ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                           ".--","-..-","-.--","--.."};
        char[] eng = new char[26];
        for(int i = 0; i < 26; i++){
            eng[i] = (char)cnt;
            cnt++;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < morese.length; j++){
                if(arr[i].equals(morese[j])){
                    answer = answer + eng[j];
                }
            }
        }
        return answer;
    }
}