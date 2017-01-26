/**
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

 Sample Input:

 [3 4 1 4 1]
 Sample Output:

 1
 If there are multiple possible answers ( like in the sample case above ), output any one.

 If there is no duplicate, output -1
 */


/**
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

 Sample Input:

 [3 4 1 4 1]
 Sample Output:

 1
 If there are multiple possible answers ( like in the sample case above ), output any one.

 If there is no duplicate, output -1
 */

public class FindDuplicate{

    public int repeatedNumber(final List<Integer> A) {
        //[3,4,1,4,1]

        int highestNumber = A.size() - 1;
        int total = getSum(A);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;

    }

    public int getSum(List<Integer> numbers){

        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
}


