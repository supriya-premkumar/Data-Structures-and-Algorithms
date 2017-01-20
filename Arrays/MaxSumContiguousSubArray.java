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
