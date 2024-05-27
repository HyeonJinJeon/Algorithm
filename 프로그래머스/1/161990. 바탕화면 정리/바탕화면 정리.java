class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minX=wallpaper[0].length()+1;
        int maxX=0;
        int minY=wallpaper.length+1;
        int maxY=0;
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    minX = Math.min(minX, j);
                    maxX = Math.max(maxX, j);
                    minY = Math.min(minY, i);
                    maxY = Math.max(maxY, i);
                }
            }
        }
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY+1;
        answer[3] = maxX+1;
        return answer;
    }
}