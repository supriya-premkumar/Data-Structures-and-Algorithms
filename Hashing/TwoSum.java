      /**  Given an array of integers, find two numbers such that they add up to a specific target number.

        The function twoSum should return indices of the two numbers such that they add up to the target,
                where index1 < index2. Please note that your returned answers (both index1 and index2 )
                are not zero-based.
        Put both these numbers in order in an array and return the array from your function ( Looking at
                the function signature will make things clearer ). Note that, if no pair exists, return empty list.

        If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions
                with the minimum index2, choose the one with minimum index1 out of them.

        Input: [2, 7, 11, 15], target=9
        Output: index1 = 1, index2 = 2 **/


      public class Solution {
          public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
              Map<Integer, Integer> map = new HashMap<>();
              ArrayList<Integer> result = new ArrayList<>();
              for (int i = 0; i < a.size(); i++) {
                  int num = a.get(i);
                  if (map.containsKey(num)) {
                      result.add(1 + map.get(num));
                      result.add(i + 1);
                      return result;
                  }
                  int r = b - num;
                  if (!map.containsKey(r)) {
                      map.put(r, i);
                  }
              }
              return result;
          }
      }