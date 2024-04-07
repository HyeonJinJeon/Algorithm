class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avgs = new double[score.length];
        
        for(int i = 0; i < score.length; i++){
            int sum = 0;
            double avg = 0;
            for(int j = 0; j < score[0].length; j++){
                sum += score[i][j];
            }
            avg = sum / 2.0;
            avgs[i] = avg;
        }
        for (int i = 0; i < answer.length; i++) {
            int rank = 1;
            for (int j = 0; j < answer.length; j++) {
                if (avgs[i] < avgs[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}