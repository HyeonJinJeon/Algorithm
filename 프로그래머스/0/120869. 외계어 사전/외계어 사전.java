class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i = 0; i < dic.length; i++){
            for(int j = 0; j < spell.length; j++){
                if(dic[i].indexOf(spell[j]) == -1){
                    answer = 2;
                    break;
                }
                if(j == spell.length-1) {
                    answer = 1;
                }
            }
            if(answer == 1){
                break;
            }
        }
        return answer;
    }
}