class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            arr[i] = my_string.charAt(i)+"";
        }
        for(int i = 0; i < my_string.length()-1; i++){
            for(int j = i+1; j < my_string.length(); j++){
                if(arr[i].equals(arr[j])){
                    arr[j]= "";
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            answer = answer + arr[i];
        }
        return answer;
    }
}