class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] each = quiz[i].split(" ");
            if(each[0].equals("-")){
                int result1 = -Integer.parseInt(each[1]);
                int result2 = Integer.parseInt(each[3]);
                int result3 = Integer.parseInt(each[5]);
                if(each[2].equals("+")){
                    if(result3 == result1+result2){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                }else if(each[2].equals("-")){
                    if(result3 == result1-result2){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                }
            }else {
                int result1 = Integer.parseInt(each[0]);
                int result2 = Integer.parseInt(each[2]);
                int result3 = Integer.parseInt(each[4]);
                if(each[1].equals("+")){
                    if(result3 == result1+result2){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                }else if(each[1].equals("-")){
                    if(result3 == result1-result2){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                }
            }
        }
        return answer;
    }
}