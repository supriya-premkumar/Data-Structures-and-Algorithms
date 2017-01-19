/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

 Example:
 Given [100, 4, 200, 1, 3, 2],
 The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

 Your algorithm should run in O(n) complexity.
 */

public class Checkpoint5_LongestConsecutiveSequence{
    public static void main(String[] args) {
        List<Integer> A = new LinkedList<Integer>();
        //6, 4, 5, 2, 3
        A.add(6);
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(3);

        System.out.println(new Solution().longestConsecutive(A));
    }


    public int longestConsecutive(final List<Integer> A) {
        if (A.size() == 0) {
            return 0;
        }

        map = new HashMap<Integer, Integer>();
        int longest = 1;

        for (Integer a : A) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
                if (map.containsKey(a - 1)) {
                    longest = Math.max(longest, mergeInterval(a - 1, a));
                }

                if (map.containsKey(a + 1)) {
                    longest = Math.max(longest, mergeInterval(a, a + 1));
                }
            }
        }
        //System.out.println(map);
        return longest;
    }

    static int mergeInterval(int left, int right) {
        int leftBorder = left - map.get(left) + 1;
        int rightBorder = right + map.get(right) - 1;
        int len = rightBorder - leftBorder + 1;
        map.put(leftBorder, len);
        map.put(rightBorder, len);
        return len;
    }
}