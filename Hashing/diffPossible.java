/**
 * Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

 Example :

 Input :

 A : [1 5 3]
 k : 2
 Output :

 1
 as 3 - 1 = 2

 Return 0 / 1 for this problem.
 */




public class Solution {
    public int diffPossible(final List<Integer> a, int b) {
        if(a==null || a.size()<2){
            return 0;
        }

        int i=0;
        int j=1;
        int diff;

        while(i<a.size() && j<a.size()){
            diff = a.get(j) -a.get(i);
            if(diff == b && i!=j){
                return 1;
            }
            else if(diff <b){
                j++;
            }else{
                i++;
            }

        }
        return 0;
    }
}
