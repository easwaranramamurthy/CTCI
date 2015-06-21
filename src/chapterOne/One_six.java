package chapterOne;

public class One_six {

  public void rotateNinety(int[][] image) {
    int n = image.length;
    for (int i = 0; i < n / 2; i++) {
      for (int j = i; j < n - i - 1; j++) {
        int temp1 = image[j][n - i - 1];
        image[j][n - i - 1] = image[i][j];
        int temp2 = image[n - i - 1][n - j - 1];
        image[n - i - 1][n - j - 1] = temp1;
        int temp3 = image[n - j - 1][i];
        image[n - j - 1][i] = temp2;
        image[i][j] = temp3;
      }
    }

  }

  public static void main(String[] args) {
    int[][] image = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 },
        { 8, 7, 6, 5 } };
    One_six solution = new One_six();
    solution.rotateNinety(image);
    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image[0].length - 1; j++) {
        System.out.print(image[i][j] + ",");
      }
      System.out.println(image[i][image[0].length - 1]);
    }
  }

}
