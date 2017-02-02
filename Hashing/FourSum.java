/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

 Note:
 Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 The solution set must not contain duplicate quadruplets.
 Example :
 Given array S = {1 0 -1 0 -2 2}, and target = 0
 A solution set is:

 (-2, -1, 1, 2)
 (-2,  0, 0, 2)
 (-1,  0, 0, 1)
 Also make sure that the solution set is lexicographically sorted.
 Solution[i] < Solution[j] iff Solution[i][0] < Solution[j][0] OR (Solution[i][0] == Solution[j][0] AND ... Solution[i][k] < Solution[j][k])
 */


public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b) {
        Collections.sort(a);

        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(a.size() < 4)
            return result;
        for(int i = 0; i < a.size(); i++){
            for(int j = i+1; j < a.size(); j++){
                int k =j+1;
                int l = a.size()-1;

                while(k < l){
                    int sum = a.get(i) +a.get(j) + a.get(k) + a.get(l);
                    if(sum > b){
                        l--;
                    }
                    else if(sum < b){
                        k++;
                    }
                    else if(sum == b){
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(a.get(i));
                        list.add(a.get(j));
                        list.add(a.get(k));
                        list.add(a.get(l));
                        if(!hashSet.contains(list)){
                            hashSet.add(list);
                            result.add(list);
                        }
                        k++;
                        l--;
                    }

                }
            }
        }
        return result;

    }

}
