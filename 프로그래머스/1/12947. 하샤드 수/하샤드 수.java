class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int sum = 0;
        int copy = x;
        while(copy > 0){
            sum += copy % 10;
            copy /= 10;
        }
        if(x % sum == 0){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
