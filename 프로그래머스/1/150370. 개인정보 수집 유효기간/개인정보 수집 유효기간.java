import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>(); 
        Map<String,Integer> termsMap = new HashMap<>();
        String[] todaySplit = today.split("\\.");

        int todayYear = Integer.parseInt(todaySplit[0]);
        int todayMonth = Integer.parseInt(todaySplit[1]);
        int todayDay = Integer.parseInt(todaySplit[2]);
        
        for(int i = 0; i < terms.length; i++){
            String[] termsSplit = terms[i].split(" ");
            termsMap.put(termsSplit[0], Integer.parseInt(termsSplit[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] privaciesSplit = privacies[i].split(" ");
            String type = privaciesSplit[1];
            String[] startDate = privaciesSplit[0].split("\\.");
            
            int startYear = Integer.parseInt(startDate[0]);
            int startMonth = Integer.parseInt(startDate[1]);
            int startDay = Integer.parseInt(startDate[2]);
            
            int TermMonth = termsMap.get(type);
            startMonth += TermMonth;
             while (startMonth > 12) {
                startYear += 1;
                startMonth -= 12;
            }
            startDay -=1;
            System.out.println(startMonth);
            
            System.out.println(startDay);
            if (startYear < todayYear || 
                (startYear == todayYear && startMonth < todayMonth) || 
                (startYear == todayYear && startMonth == todayMonth && startDay < todayDay)) {
                answerList.add(i + 1);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i =0; i< answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}