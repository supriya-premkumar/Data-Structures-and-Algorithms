public class Solution {
    public int searchInsert(ArrayList<Integer> A, int B) {
        if(A == null) return 0;
        if(B <= A.get(0)) return 0;

        for(int i = 0; i < A.size()-1; i++){
            if(A.get(i) < B && B <= A.get(i + 1))
                return i + 1;
        }
        return A.size();

    }
