import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            if (c1 == c2) {
                return s1.compareTo(s2);
            } else {
                return Character.compare(c1, c2);
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