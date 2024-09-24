import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++){
            Queue<Character> skillQueue = new LinkedList<>(); 
            
            for(int z = 0; z < skill.length(); z++){
                skillQueue.offer(skill.charAt(z));
            }
            for(int j = 0; j < skill_trees[i].length(); j++){
                if(j == skill_trees[i].length()-1){
                    if(!skillQueue.contains(skill_trees[i].charAt(j)) 
                       || skillQueue.peek() == skill_trees[i].charAt(j)){
                        answer++;
                    }
                }
                if(!skillQueue.contains(skill_trees[i].charAt(j))){
                    continue;
                }
                if(skillQueue.peek() == skill_trees[i].charAt(j)){
                    skillQueue.poll();
                }else{
                    break;
                }
            }
            
        }
        return answer;
    }
}