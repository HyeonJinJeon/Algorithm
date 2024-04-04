class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0; //던지는 사람의 인덱스 번호
        for(int i = 0; i < k; i ++){
            if(index == numbers.length-1) {
                answer = numbers[index];
                index = 1;
            } else if(index == numbers.length-2) {
                answer = numbers[index];
                index = 0;
            }else{
                answer = numbers[index];
                index += 2;
            }
        }
        return answer;
    }
}