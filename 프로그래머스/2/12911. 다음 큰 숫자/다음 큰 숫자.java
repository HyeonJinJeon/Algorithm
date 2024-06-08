class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n+1;
        String binaryN = Integer.toBinaryString(n);;
        String binaryNum = "";
        int cnt = 0;
        while(true){
            binaryN = binaryN.replace("0", "");
            binaryNum = Integer.toBinaryString(num);
            binaryNum = binaryNum.replace("0", "");
            if(binaryN.length() == binaryNum.length()){
                cnt++;
                break;
            }else {
                num++;
                cnt++;
            }
        }
        answer = n + cnt;
        return answer;
    }
}