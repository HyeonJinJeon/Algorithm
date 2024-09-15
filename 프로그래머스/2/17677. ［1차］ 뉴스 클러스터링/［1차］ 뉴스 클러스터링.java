import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int sum = 0;
        int cup = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String s1 = str1.substring(i, i + 2).replaceAll("[^a-zA-Z]", "");
            if (s1.length() == 2){
                str1List.add(s1);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String s2 = str2.substring(i, i + 2).replaceAll("[^a-z]", "");
            if (s2.length() == 2){
                str2List.add(s2);
            }
        }
        
        sum = str1List.size() + str2List.size();
        
        for(int i = 0; i < str1List.size(); i++){
            String str = str1List.get(i);
            if(str2List.contains(str)){
                cup++;
                str2List.remove(str);
            }
        }
        sum = sum - cup;
        System.out.println(sum);
        System.out.println(cup);
        
        if(sum == 0){
            if(str1.equals(str2)){
                answer = 65536;
            }else{
                answer = 0;
            }
        }else{
            answer = (int)(((double)cup / sum) * 65536);
        }
        
        return answer;
    }
}