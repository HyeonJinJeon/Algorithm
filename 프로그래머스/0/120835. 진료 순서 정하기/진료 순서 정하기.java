class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int index = 0;
        for(int i = 0; i < emergency.length; i++){
            int top = emergency[i];
            int loc = i;
            
            for(int j = 0; j < emergency.length; j++){
                if(top < emergency[j]){
                    top = emergency[j];
                    loc = j;
                }
            }
            index++;
            emergency[loc] = 0;   
            answer[loc] = index;
        }
        return answer;
    }
}