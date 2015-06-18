package chapterOne;
import java.util.HashMap;
import java.util.Map;


public class One_three {

  public boolean isPermutation(String s1, String s2) {
    Map<Character, Integer> counts1 = new HashMap<Character, Integer>();
    Map<Character, Integer> counts2 = new HashMap<Character, Integer>();
    
    for(int i=0;i<s1.length();i++){
      if(!counts1.containsKey(s1.charAt(i))){
        counts1.put(s1.charAt(i), 0);
      }
      counts1.put(s1.charAt(i), counts1.get(s1.charAt(i))+1);
    }
    
    for(int i=0;i<s2.length();i++){
      if(!counts1.containsKey(s2.charAt(i))){
        return false;
      }
      if(!counts2.containsKey(s2.charAt(i))){
        counts2.put(s2.charAt(i), 0);
      }
      counts2.put(s2.charAt(i), counts2.get(s2.charAt(i))+1);
    }
    
    for(char ch:counts1.keySet()){
      if(!counts2.containsKey(ch)){
        return false;
      }
      if(!(counts1.get(ch)==counts2.get(ch))){
        return false;
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    One_three solution = new One_three();
    System.out.println(solution.isPermutation("a", ""));
    System.out.println(solution.isPermutation("", ""));
    System.out.println(solution.isPermutation("abcd", "bdca"));
    System.out.println(solution.isPermutation("aabbccdd", "abcdabcd"));
  }

}
