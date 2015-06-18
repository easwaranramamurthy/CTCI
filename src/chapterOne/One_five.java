package chapterOne;

public class One_five {

  public String compressString(String str){
    if(str.length()==0){
      return "";
    }
    StringBuffer out = new StringBuffer();
    char currChar = str.charAt(0);
    int currCount = 1;
    int i=1;
    while(i<str.length()){
      if(str.charAt(i)==currChar){
        currCount++;
      }
      else{
        out.append(currChar);
        out.append(currCount);
        currChar = str.charAt(i);
        currCount = 1;
      }
      i++;
    }
    out.append(currChar);
    out.append(currCount);
    
    String ans = out.toString();
    
    if(ans.length()>str.length()){
      return str;
    }
    return ans;
  }
  
  
  public static void main(String[] args) {
    One_five solution = new One_five();
    String str = "AAAAaaabbbBBBBcBBBBbbbb";
    String ans = solution.compressString(str);
    System.out.println(ans);
  }

}
