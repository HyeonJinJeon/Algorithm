/*
    주의할 점은 한 발음을 연속적으로 못하는 것이지 안 단어 안에 같은 발음을 못하는 것이 아니다!!
*/
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < str.length; j++){
                //" "(공백)으로 치환하는 이유는 ""(공백없이)로 치환하면 wyeoo같은 경우는
                //wyeoo에서 ye가 빠지면 woo가 되고 woo가 빠지면 옹알이가 가능한 상태로 인식한다.
                //" "(공백)으로 치환하면 ye가 빠졌을 때 w oo로 되기때문제 woo의 영향을 받지 않는다.
                if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || 
                   babbling[i].contains("woowoo") || babbling[i].contains("mama")){
                
                       continue;
                }else{
                    babbling[i] = babbling[i].replace(str[j]," ");   
                }
            }
        }
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].replace(" ","").equals("")){
                answer++;
            }
        }
        return answer;
    }
}