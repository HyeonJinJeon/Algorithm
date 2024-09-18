import java.util.*;

class Solution {
    static String[] vowels = {"A", "E", "I", "O", "U"};
    List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        addWord("");
        Collections.sort(list);
        return list.indexOf(word) + 1; 
    }
    
    public void addWord(String preWord) {
        if (preWord.length() > 5) {
            return;
        }
        if (!preWord.isEmpty()) { 
            list.add(preWord);
        }
        for (String vowel : vowels) {
            addWord(preWord + vowel);
        }
    }
}
