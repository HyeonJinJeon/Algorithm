import java.util.Arrays;
class Solution {
    public int solution(String[][] book_time) {
        int n = book_time.length;
        int[] start = new int[n];
        int[] end = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = changeMin(book_time[i][0]);
            end[i] = changeMin(book_time[i][1]) + 10;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int roomsNeeded = 0;
        int endIndex = 0;
        
        for (int s : start) {
            if (s >= end[endIndex]) {
                endIndex++;
            } else {
                roomsNeeded++;
            }
        }
        
        return roomsNeeded;
    }
    
    private int changeMin(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
