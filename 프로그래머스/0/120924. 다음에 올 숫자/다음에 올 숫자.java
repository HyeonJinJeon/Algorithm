class Solution {
    public int solution(int[] common) {
        //common은 등비 or 등차
        //등비수열일 결우
        int answer = 0;
        int gap = 0;
        if(common[1] - common[0] == common[2] - common[1]) {
            gap = common[1] - common[0];
            answer = common[common.length-1] + gap;
        }else if(common[1]/common[0] == common[2]/common[1]){
            gap = common[1] / common[0];
            answer = common[common.length-1] * gap;
        } 
        return answer;
    }
}