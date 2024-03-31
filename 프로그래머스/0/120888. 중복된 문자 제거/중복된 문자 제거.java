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
        
        /*
        더 좋은 방법!!
        indexOf()를 사용하기
            -> indexOf()는 해당 문자열이 처음 나타나는 인덱스를 반환하는 것임
                즉, 해당 문자열이 처음 나타나는 인덱스의 문자열만 추가함으로써 
                뒤에 반복되서 나오는 문자열은 answer에 추가하지 않는다.
        */ 
        // for (int i = 0; i < my_string.length(); i++) {
        //     if(my_string.indexOf(my_string.charAt(i)) == i) {
        //         answer += my_string.charAt(i);
        //     }
        // }
        return answer;
    }
}