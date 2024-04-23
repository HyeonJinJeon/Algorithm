import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        max1 = sizes[0][0];
        for(int i = 1; i < sizes.length; i++){
            if(max1 < sizes[i][0]){
                max1 = sizes[i][0];
            }
        }
        
        max2 = sizes[0][1];
        for(int i = 1; i < sizes.length; i++){
            if(max2 < sizes[i][1]){
                max2 = sizes[i][1];
            }
        }
        return max1 * max2;
    }
}