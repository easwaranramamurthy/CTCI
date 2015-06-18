package chapterOne;

public class One_eight {

  public boolean isRotation(String s1, String s2){
    if(s1.length()!=s2.length()){
      return false;
    }
    
    String s1s1 = s1+s1;
    return s1s1.contains(s2);
  }
  
  public static void main(String[] args) {

    One_eight solution = new One_eight();
    String s1 = "a";
    String s2 = "b";    
    System.out.println(solution.isRotation(s1, s2));
    s1 = "waterbottle";
    s2 = "erbottlewat";
    System.out.println(solution.isRotation(s1, s2));
  }

}
