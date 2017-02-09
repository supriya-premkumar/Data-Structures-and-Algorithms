public class Solution {
    public int sqrt(int a) {
        long i = 0;
        long j = a/ 2 + 1;
        while(i <= j){
            long mid = (i + j) / 2;
            if(mid *  mid == a)
                return (int)mid;
            if(mid *  mid < a)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return (int)j;
    }
}
