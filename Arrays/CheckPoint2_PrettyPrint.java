/**
Print concentric rectangular pattern in a 2d matrix.
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

Example 2:

Input: A = 3.
Output:

3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.

See Expected Output

**/
import java.util.ArrayList;

public class CheckPoint2_PrettyPrint{
  public static void main(String[] args){
    System.out.print(prettyPrint(2));
  }

  public static ArrayList<ArrayList<Integer>> prettyPrint(int a){
      ArrayList<ArrayList<Integer>> pp = new ArrayList<ArrayList<Integer>>();

      int n = 2 * A - 1;

      int[][] p = new int[n][n];

      int T = 0;
      int B = n - 1;
      int L = 0;
      int R = n - 1;

      while (A > 0) {
          for (int i = L; i <= R; i++) {
              p[T][i] = A;
              p[B][i] = A;
          }

          for (int i = T; i <= B; i++) {
              p[i][R] = A;
              p[i][L] = A;
          }

          T++;
          L++;
          B--;
          R--;

          A--;
      }

      for (int i = 0; i < n; i++) {
          ArrayList<Integer> row = new ArrayList<Integer>();
          for (int j = 0; j < n; j++) {
              row.add(p[i][j]);
          }
          pp.add(row);
      }
      return pp;
  }
 }


