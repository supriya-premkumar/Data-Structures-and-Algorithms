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
//import java.util.Arrays.ArrayList;

public class CheckPoint2_PrettyPrint{
  public static void main(String[] args){
    prettyPrint(4);
  }

  public static void prettyPrint(int a){
      ArrayList<ArrayList<Integer>> array = new ArrayList<>();

      int x = (2*a)-1;
      int[][] prettyArray = {{3,3,3,3,3},
                             {3,2,2,2,3},
                             {3,2,1,2,3},
                             {3,2,2,2,3},
                             {3,3,3,3,3}}; //new int[x][x];

      for(int i=0; i<x; i++) {
        for(int j =0; j<x; j++) {
            System.out.println(prettyArray[i][j]);
        }
      }



    // int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};



                          // {{1,2,3,4,5},
                          //  {6,9,8,7,12},
                          //  {13,14,15,16,17},
                          //  {18,19,20,21,22}};
  // for (ArrayList<Integer> list : arrayList) {
  //   for (Integer i : list) {
  //       System.out.print(i+" ");
  //   }
  //   System.out.println();

    // for(int i =0; i<(n-1); i++){
    //   for (int j =0; j<(m-1); j++){
    //       System.out.println(array[i][j]);
    //
    //   }
    // }

  }
 }

