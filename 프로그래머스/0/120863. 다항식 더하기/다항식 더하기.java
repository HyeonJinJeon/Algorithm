class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String pol = polynomial.replace(" +", "");
        String[] each = pol.split(" ");
        int x = 0;
        int noX = 0;

        for(int i = 0; i < each.length; i++){
            if (!each[i].contains("x")) {
                noX += Integer.parseInt(each[i]);
            } else {
                if(each[i].equals("x")){
                    x += 1;
                }else{
                    String[] splitX = each[i].split("x");
                    x += Integer.parseInt(splitX[0]);
                }
            }
        }
        if(x == 0){
            answer = ""+noX;
        }else if(noX == 0){
            if(x == 1){
                answer = "x";
            }else{
                answer = x+"x";
            }
        }else{
            if(x == 1){
                answer = "x " + "+ " + noX ;
            }else{
                answer = x+"x " + "+ " + noX;
            }
        }
        return answer;
    }
}