import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> slopes = new ArrayList<>();

            for (int j = 1; j < dots.length; j++) {
                if(j == 1){
                    double slope1 = (double)(dots[j][1] - dots[0][1]) / (dots[j][0] - dots[0][0]);
                    double slope2 = (double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
                    if(slope1 == slope2){
                        slopes.add(slope1);
                    }else{
                        slopes.add(slope1);
                        slopes.add(slope2);
                    }
                }else if(j == 2) {
                    double slope1 = (double) (dots[j][1] - dots[0][1]) / (dots[j][0] - dots[0][0]);
                    double slope2 = (double) (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
                    if(slope1 == slope2){
                        slopes.add(slope1);
                    }else{
                        slopes.add(slope1);
                        slopes.add(slope2);
                    }
                } else{
                    double slope1 = (double)(dots[j][1] - dots[0][1]) / (dots[j][0] - dots[0][0]);
                    double slope2 = (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
                    if(slope1 == slope2){
                        slopes.add(slope1);
                    }else{
                        slopes.add(slope1);
                        slopes.add(slope2);
                    }
                }
            }
        if (slopes.size() < 6) {
            answer = 1;
        }

        return answer;
    }
}
