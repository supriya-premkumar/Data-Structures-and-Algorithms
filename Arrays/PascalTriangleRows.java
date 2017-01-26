/*************************************************************
 * *******************DESRCIPTION*****************************
 *
 *Pascal Triangle Rows:
 *
 Given numRows, generate the first numRows of Pascal’s triangle.

 Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

 Example:

 Given numRows = 5,

 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 *
 *
 *
 **************************************************************/

public ArrayList<ArrayList<Integer>> generate(int a){

        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<ArrayList<Integer>>();
        if(a <= 0)
        return pascalTriangle;
        ArrayList<Integer> preRow = new ArrayList<Integer>();
        preRow.add(1);
        pascalTriangle.add(preRow);
        for(int i = 2; i <= a; i++){
        ArrayList<Integer> currRow = new ArrayList<Integer>();
        currRow.add(1);
        for(int j = 0; j < preRow.size()- 1; j++){
        currRow.add(preRow.get(j) + preRow.get(j+1));
        }
        currRow.add(1);
        pascalTriangle.add(currRow);
        preRow = currRow;
        }
        return pascalTriangle;


}