public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        result.add(new ArrayList<Integer>());
        for(int i =0; i < a.size(); i++){
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();

            for(ArrayList<Integer> l : result){

                for(int j =0; j < l.size() + 1; j++){

                    l.add(j, a.get(i));
                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);
                    for(int k = 0; k< current.size(); k++)
                        l.remove(j);
                }
            }
            result = new ArrayList<ArrayList<Integer>>(current);
        }
        return result;
    }
}
