/**
 * Given an input string, reverse the string word by word.

 Example:

 Given s = "the sky is blue",

 return "blue is sky the".

 A sequence of non-space characters constitutes a word.
 Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */




public class ReverseTheString{

    public static void main(String[] args){
        System.out.print(reverseWords(" the  sky  is  blue  color"));

    }

    public static String reverseWords(String a) {
        String first;
        String temp;
        String last;
        String w = a.trim().replaceAll(" +", " ");
        String[] splitWords = w.split(" ");
        int i =0;
        int j = splitWords.length-1;
        while(j>i){
                temp = splitWords[j];
                splitWords[j]=splitWords[i];
                splitWords[i] = temp;

            j --;
            i++;

        }
        String result = String.join(" ", splitWords);

        return result;
    }
}