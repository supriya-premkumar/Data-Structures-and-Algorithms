/**
 *Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 Example:

 Given s = "Hello World",

 return 5 as length("World") = 5.

 Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
 *
 **/



//public int lengthOfLastWord(final String a) {
//        int size = a.length() - 1;
//        int lastWordLength = 0;
//        for(int i = size; i >= 0; i--){
//        if (a.charAt(i) == ' '){
//        continue;
//        }
//
//        lastWordLength = lastWordLength + 1;
//        if (a.charAt(i) == ' '){
//        break;
//        }
//
//        }
//        return lastWordLength;
//        }


public int lengthOfLastWord(final String a) {
        if (a == null || a.length() == 0 || a.trim().isEmpty()) {
        return 0;
        }

        String[] arr = a.split(" ");
        return arr[arr.length - 1].length();
        }