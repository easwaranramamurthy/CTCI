import java.util.HashSet;
import java.util.Set;

public class One_one{
	public boolean hasAllUnique(String s){
		Set<Character> seen = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			if(seen.contains(s.charAt(i))){
				return false;
			}
			seen.add(s.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args){
	  One_one solution = new One_one();
	  System.out.println(solution.hasAllUnique("aabcd"));
	  System.out.println(solution.hasAllUnique(""));
	  System.out.println(solution.hasAllUnique("abcd"));
	  System.out.println(solution.hasAllUnique("aaaa"));
	}
}