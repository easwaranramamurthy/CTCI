
public class One_seven {

  public void setZeros(int[][] matrix){
    if(matrix.length==0){
      return;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int[] rowSetZero = new int[m];
    int[] colSetZero = new int[n];
    
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(matrix[i][j]==0){
          rowSetZero[i] = 1;
          colSetZero[j] = 1;
        }
      }
    }
    
    
    for(int i=0;i<m;i++){
      if(rowSetZero[i]==1){
        nullifyRow(matrix,i, n);
      }
    }
    for(int j=0;j<n;j++){
      if(colSetZero[j]==1){
        nullifyCol(matrix,j, m);
      }
    }
  }
  


  
  
  private void nullifyCol(int[][] matrix, int j, int m) {
    for(int i=0;i<m;i++){
      matrix[i][j] = 0;
    }
  }

  private void nullifyRow(int[][] matrix, int i, int n) {
    for(int j=0;j<n;j++){
      matrix[i][j] = 0;
    }
  }





  public static void main(String[] args) {
    One_seven solution = new One_seven();
    int[][] matrix = {{1,1,0},{1,1,1},{1,1,1},{1,0,1}};
    solution.setZeros(matrix);
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length-1;j++){
        System.out.print(matrix[i][j]);
        System.out.print(",");
      }
      System.out.println(matrix[i][matrix[0].length-1]);
    }
  }
}
