class Solution {
    public String[] solution(String str, int n) {
        int size = 0;
        if(str.length() % n == 0){
            size = str.length()/n;
        } else {
            size = str.length()/n+1;
        }
        String[] answer = new String[size];
        int index = 0;
        for(int i = 0; i < str.length(); i+=n){
                if(str.length() - i+1 >= n){
                    answer[index++] = str.substring(i, i+n);
                }else {
                    answer[index++] = str.substring(i);
                }
        }
        return answer;
    }
}