class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] str1 = new String[arr1.length];
        String[] str2 = new String[arr2.length];
        
        
        for(int i = 0; i < arr1.length; i++){
            str1[i] = Integer.toBinaryString(arr1[i]);
            str2[i] = Integer.toBinaryString(arr2[i]);
            answer[i] = "";
            while(str1[i].length()<n){
                str1[i] = "0" + str1[i];
            }
            while(str2[i].length()<n){
                str2[i] = "0" + str2[i];
            }
        }
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < n; j++){
                if(str1[i].charAt(j)=='1' || str2[i].charAt(j)=='1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}