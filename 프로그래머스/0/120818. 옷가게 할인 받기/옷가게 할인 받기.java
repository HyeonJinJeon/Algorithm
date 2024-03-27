class Solution {
    public int solution(int price) {
        double answer = price;
        if((price >= 100000) && (price < 300000)){
            answer = (double)price * 0.95;
        }else if((price >= 300000) && (price < 500000)){
            answer = (double)price * 0.9;    
        }else if(price >= 500000) {
            answer = (double)price * 0.8;           
        }
        return (int)answer;
    }
}