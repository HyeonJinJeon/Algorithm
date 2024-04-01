class Solution {
    public int solution(String before, String after) {
        StringBuilder sb1 = new StringBuilder(before);
        StringBuilder sb2 = new StringBuilder(after);
        String compare = "";
        int answer = 0;
        for(int i = 0; i < sb1.length(); i++){
            for(int j = 0; j < sb2.length(); j++){
                if(sb1.charAt(i) == sb2.charAt(j)){
                    sb1.setCharAt(i,'-');
                    sb2.setCharAt(j,'-');
                }
            }
        }
        for(int i = 0; i < sb1.length(); i++){
            compare += "-";
        }
        after = String.valueOf(sb2);
        if(after.equals(compare)){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}
/*더 좋은 방법*/
// import java.util.Arrays;
// class Solution {
//     public int solution(String before, String after) {
//         char[] a = before.toCharArray(); // String명.toChatArray()문자 배열로 변환
//         char[] b = after.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);

//         return new String(a).equals(new String(b)) ? 1 :0;
//     }
// }