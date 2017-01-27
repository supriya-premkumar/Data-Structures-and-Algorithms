/***
 *
 Given a string,
 find the length of the longest substring without repeating characters.

 Example:

 The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.

 For "bbbbb" the longest substring is "b", with the length of 1.
 *
 *
 */



public class LongestSubstringWithoutRepeat{

    public int lengthOfLongestSubstring(String a) {

        if(a==null){
            return 0;
        }

        HashSet<Character> hashset = new HashSet<Character>();
        int len = 0;
        int maxLen = Integer.MIN_VALUE;

        for(int i = 0; i < a.length(); i++){
            if(hashset.contains(a.charAt(i))){
                len--;
                hashset.remove(a.charAt(i));
            }
            hashset.add(a.charAt(i));
            len++;

            if(len > maxLen){
                maxLen = len;
            }
        }
        return maxLen;
    }

}