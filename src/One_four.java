
public class One_four {

  public void replaceSpaces(char[] str, int trueLength){
    char[] copy = new char[str.length];
    int j = 0;
    
    for(int i=0;i<trueLength;i++){
      if(str[i]==' '){
        copy[j] = '%';
        j++;
        copy[j] = '2';
        j++;
        copy[j] = '0';
      }
      else{
        copy[j] = str[i];
      }
      j++;
    }
    
    for(int k=0;k<copy.length;k++){
      str[k] = copy[k];
    }
  }
  
  
  public static void main(String[] args) {
    One_four solution = new One_four();
    String in = "Mr John Smith    ";
    int length = 13;
    char[] str = in.toCharArray();
    solution.replaceSpaces(str, length);
    for(int i=0;i<str.length;i++){
      System.out.print(str[i]);
    }
  }

}
