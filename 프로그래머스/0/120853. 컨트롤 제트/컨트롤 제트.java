class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ss = s.split(" ");
        for(int i = 0; i < ss.length; i++){
            if(!ss[i].equals("Z")){
                answer += Integer.parseInt(ss[i]);
            }else {
                answer -= Integer.parseInt(ss[i-1]);
            }
        }
        return answer;
    }
}