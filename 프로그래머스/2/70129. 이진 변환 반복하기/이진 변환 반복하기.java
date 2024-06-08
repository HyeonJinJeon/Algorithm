class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        answer[0] = 0;
        int preLen = s.length();
        
        while(!s.equals("1")){
            s = s.replace("0", "");
            System.out.println(s);
            int lastLen = s.length();
            answer[0]++;
            answer[1] += preLen - lastLen;
            s = Integer.toBinaryString(lastLen);
            preLen = s.length();
        }
        
        return answer;
    }
}