class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n, 3);
        StringBuffer str = new StringBuffer(three);
        String rThree = str.reverse().toString();
        System.out.println(rThree);     
        answer = Integer.parseInt(rThree, 3);
        return answer;
    }
}