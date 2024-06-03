import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //시전 시간, 초당 회복량, 추가 회복량
        int answer = 0;
        int hp = health;
        int successTime = 0;
        int finishTime = attacks[attacks.length-1][0];
        Map<Integer, Boolean> map = new HashMap<>(); // 각 시간마다 공격 유무
        int index = 0;
        for(int i = 1; i <= finishTime; i++){
            if(i == attacks[index][0]){
                map.put(i, true);
                index++;
            }else {
                map.put(i, false);
            }
        }
        index = 0;
        for(int i = 1; i <= finishTime; i++){
            //공격을 받는 상태가 아니면
            if(!map.get(i)){
                //초당 회복량 더하기
                hp += bandage[1];
                //연속 성공시간 추가
                successTime++;
                //연속 성공시간이 지연시간이랑 일치하면(즉, 붕대를 온전히 감은 경우)
                if(successTime == bandage[0]){
                    //추가 회복량 더하기
                    hp += bandage[2];
                    successTime = 0;
                }
                //만약 최대체력을 넘는다면
                if(hp > health){
                    hp = health;
                }
            }else{ // 공격을 받은 경우
                //체력 감소
                hp -= attacks[index][1];
                //연속성공 초기화
                successTime = 0;
                index++;
                //캐릭터가 죽은 경우
                if(hp <= 0){
                    hp = -1;
                    break;
                }
            }
        }       
        answer = hp;
        return answer;
    }
}