/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example:

 Given the array [-2,1,-3,4,-1,2,1,-5,4],

 the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 For this problem, return the maximum sum.
 */

public class MaxSumContiguousSubArray {
    // DO NOT MODFIY THE LIST.
    public int maxSubArray(final List<Integer> a) {
        int newSum = a.get(0);
        int sum = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            newSum = Math.max(newSum + a.get(i), a.get(i));
            sum = Math.max(sum, newSum);
        }
        return sum;
    }
}
