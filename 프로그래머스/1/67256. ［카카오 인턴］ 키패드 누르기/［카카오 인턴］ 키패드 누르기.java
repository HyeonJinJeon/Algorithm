class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 9;
        int right = 11;
        for(int n : numbers){
            n--;
            if(n == -1){
                n = 10;
            }
            if(n%3 == 0){
                left = n;
                answer += "L";
            }else if(n%3 == 2){
                right = n;
                answer += "R";
            }else {
                if(distance(left, n) == distance(right, n)){
                    if(hand.equals("left")){
                        left = n;
                        answer += "L";
                    }else {
                        right = n;
                        answer += "R";
                    }
                }else if(distance(left, n) > distance(right, n)){
                    right = n;
                    answer += "R";
                }else {
                    left = n;
                    answer += "L";
                }
            }
        }
        return answer;
    }
    public static int distance(int start, int end){
        return Math.abs(start%3 - end%3) + Math.abs(start/3 - end/3);
    }
}