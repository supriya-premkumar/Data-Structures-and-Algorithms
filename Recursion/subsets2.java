public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {

        if(a == null || a.size() == 0)
            return null;
        Collections.sort(a);
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
        for(int i = 0; i < a.size(); i++){
            HashSet<ArrayList<Integer>> temp = new HashSet<ArrayList<Integer>>();
            for(ArrayList<Integer> list : result){
                if(!temp.contains(list))
                    temp.add(new ArrayList<Integer>(list));
            }
            for(ArrayList<Integer> list : temp)

                for(ArrayList<Integer> list : temp){
                    list.add(a.get(i));
                }
            ArrayList<Integer> single = new ArrayList<Integer>();
            single.add(a.get(i));
            temp.add(single);


            for(ArrayList<Integer> list : temp){
                if(!result.contains(list))
                    result.add(new ArrayList<Integer>(list));
            }

        }
        result.add(new ArrayList<Integer>());

        ArrayList<ArrayList<Integer>> result2 = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> list : result){

            result2.add(new ArrayList<Integer>(list));
        }
        Collections.sort(result2, new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
                for(int i = 0; i < Math.min(a.size(), b.size()); i++){
                    int cmp = Integer.compare(a.get(i), b.get(i));
                    if(cmp != 0)
                        return cmp;
                }
                return Integer.compare(a.size(), b.size());
            }
        });

        return result2;
    }
}
