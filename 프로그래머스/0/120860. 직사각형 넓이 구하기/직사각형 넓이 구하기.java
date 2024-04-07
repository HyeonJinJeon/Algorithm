class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        for(int i = 0; i < dots.length-1; i++){
            if(dots[i][0] != dots[i+1][0]){
                width = Math.abs(dots[i][0] - dots[i+1][0]);
                break;
            }
        }
        for(int i = 0; i < dots.length-1; i++){
            if(dots[i][1] != dots[i+1][1]){
                height = Math.abs(dots[i][1] - dots[i+1][1]);
                break;
            }
        }
        answer = width * height;
        return answer;
    }
}