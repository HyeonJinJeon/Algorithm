class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals("")){
                answer = answer + Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}