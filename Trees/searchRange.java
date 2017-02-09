public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int start = 0;
        int end = A.size() - 1;
        int mid = 0;
        int rStart = -1;
        while(start < end){
            mid = start +  (end - start)/2;
            if(B > A.get(mid)){
                start = mid + 1;
            }
            else
                end = mid;
        }

        int low;
        if(B != A.get(start)){
            result.add(-1);
            result.add(-1);
            return result;
        }
        else
            low = start;

        start = 0;
        end = A.size() -1;
        while(start < end){
            mid = start + (end - start)/2;
            if(A.get(mid) < B + 1)
                start = mid + 1;
            else
                end = mid;
        }

        int high = 0;
        if(A.get(start) == B)
            high = start;
        else
            high = start - 1;
        System.out.print(low + " " + high);
        result.add(low);
        result.add(high);
        return result;
    }
}
