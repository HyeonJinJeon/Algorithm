class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String arr[] = dartResult.split("");
        int result[] = new int[3];
        int index = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("1")){
                if(arr[i+1].equals("0")){
                    arr[i+1] = "10";
                    i++;
                }
                continue;
            }else if(arr[i].equals("S")){
                result[index++] += Integer.parseInt(arr[i-1]);
            }else if(arr[i].equals("D")){
                result[index++] += Math.pow(Integer.parseInt(arr[i-1]), 2);
            }else if(arr[i].equals("T")){
                result[index++] += Math.pow(Integer.parseInt(arr[i-1]), 3);
            }else if(arr[i].equals("*")){
                if(i == 2){
                    result[index-1] *= 2; 
                }else{
                    result[index-2] *= 2;
                    result[index-1] *= 2;
                }
            }else if(arr[i].equals("#")){
                result[index-1] *= -1;
            }
        }
        for(int i = 0; i < result.length; i++){
            answer += result[i];
        }
        return answer;
    }
}