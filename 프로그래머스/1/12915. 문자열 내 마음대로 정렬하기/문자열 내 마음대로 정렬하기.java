import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            } else {
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
            // if(s1.charAt(n) > s2.charAt(n)){
            //     return 1;
            // } 
            // else if(s1.charAt(n) == s2.charAt(n)){
            //     return s1.compareTo(s2);
            // } 
            // else{
            //     return -1;
            //  } 
        });
        return strings;
    }
}