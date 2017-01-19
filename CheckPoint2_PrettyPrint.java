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
      ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

      int input = a;
      int x = (2*a)-1;
      int[][] array = new int[x][x];

      int rowCount = 0;
      int columnCount = x-1;
      int j;



      while(a>0){

          for(int i= 0; i<x; i++) {
              if(a==1){
                  array[input-1][input-1]=1;
              }else {

                  array[rowCount][i] = a;


                  array[columnCount][i] = a;
              }
          }



          for(j=0; j<x; j++){
              if(a==1){
                  array[input-1][input-1]=1;
              }else{
                  array[j][columnCount] = a;
                  array[j][rowCount] = a;
              }

          }

          rowCount++;
          columnCount--;
          j++;

          a--;

      }

      for(int k =0; k<x; k++){
          ArrayList<Integer> list = new ArrayList<>();
          for(int n =0; n<x; n++){
              list.add(array[k][n]);
          }
          arrayList.add(list);
      }

      return arrayList;

  }
 }


