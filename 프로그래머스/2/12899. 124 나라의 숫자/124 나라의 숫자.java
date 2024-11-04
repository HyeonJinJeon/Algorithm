class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int front, back = 0;
        while(n > 0){
            front = n / 3;
            back = n % 3;
            if(back == 0){
                back = 4;
                front -= 1;
            }
            answer.append(back);
            n = front;
        }
        return answer.reverse().toString();
    }
}