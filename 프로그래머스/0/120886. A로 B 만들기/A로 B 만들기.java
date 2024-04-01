class Solution {
    public int solution(String before, String after) {
        StringBuilder sb1 = new StringBuilder(before);
        StringBuilder sb2 = new StringBuilder(after);
        String compare = "";
        int answer = 0;
        for(int i = 0; i < sb1.length(); i++){
            for(int j = 0; j < sb2.length(); j++){
                if(sb1.charAt(i) == sb2.charAt(j)){
                    sb1.setCharAt(i,'-');
                    sb2.setCharAt(j,'-');
                }
            }
        }
        for(int i = 0; i < sb1.length(); i++){
            compare += "-";
        }
        after = String.valueOf(sb2);
        if(after.equals(compare)){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}