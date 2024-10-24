class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        zip(arr, 0, 0, arr[0].length, answer);
        return answer;
    }
    public void zip(int[][] arr , int x , int y , int size , int[] answer){
        if(chk(arr, x, y, size)){
            if(arr[x][y] == 0){
                answer[0]++;
                return;
            }else{
                answer[1]++;
                return;
            }
        }
        int newSize = size / 2;
        int halfOverX = x + size / 2;
        int halfOverY = y + size / 2;
        zip(arr, x, y, size / 2, answer);
        zip(arr, x, halfOverY, size / 2, answer);
        zip(arr, halfOverX, y, size / 2, answer);
        zip(arr, halfOverX, halfOverY, size / 2, answer);
    }
    public boolean chk(int[][]arr , int x , int y , int size){
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[x][y] != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}