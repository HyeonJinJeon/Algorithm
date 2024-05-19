import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        String answer = "";
        for(int i = 0; i < choices.length; i++){
            getScore(map, survey[i], choices[i]);
        }
        answer = getType(map, answer);
        return answer;
    }
    public static void getScore(Map<Character, Integer> map, String part, int choice){
        if(choice == 1){
            map.put(part.charAt(0), map.getOrDefault(part.charAt(0), 0) + 3);
        }else if(choice == 2){
            map.put(part.charAt(0), map.getOrDefault(part.charAt(0), 0) + 2);
        }else if(choice == 3){
            map.put(part.charAt(0), map.getOrDefault(part.charAt(0), 0) + 1);
        }else if(choice == 4){
            map.put(part.charAt(0), map.getOrDefault(part.charAt(0), 0) + 0);
        }else if(choice == 5){
            map.put(part.charAt(1), map.getOrDefault(part.charAt(1), 0) + 1);
        }else if(choice == 6){
            map.put(part.charAt(1), map.getOrDefault(part.charAt(1), 0) + 2);
        }else if(choice == 7){
            map.put(part.charAt(1), map.getOrDefault(part.charAt(1), 0) + 3);
        }
    }
    public static String getType(Map<Character, Integer> map, String answer){
        if(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0)){
            answer += "R";
        }else{
            answer += "T";
        }
        if(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0)){
            answer += "C";
        }else{
            answer += "F";
        }
        if(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0)){
            answer += "J";
        }else{
            answer += "M";
        }
        if(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0)){
            answer += "A";
        }else{
            answer += "N";
        }
        return answer;
    }
}