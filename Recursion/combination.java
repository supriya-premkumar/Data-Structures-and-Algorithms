public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
        if(n == 0)
            return result;
        Collections.sort(n);

        ArrayList<Integer> currentList = new ArrayList<Integer>();
        HashSet<ArrayList<Integer>> set = new  HashSet<ArrayList<Integer>>();
        combinationSum(n, k, 0, currentList, result, set);

        return result;
    }
}
