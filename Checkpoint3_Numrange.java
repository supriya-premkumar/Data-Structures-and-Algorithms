/**Given an array of non negative integers A, and a range (B, C),
 find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

 Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
 where 0 <= i <= j < size(A)

 Example :

 A : [10, 5, 1, 0, 2]
 (B, C) : (6, 8)
 ans = 3
 as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

 NOTE : The answer is guranteed to fit in a 32 bit signed integer.
 *
 **/
import java.util.ArrayList;

public class Checkpoint3_Numrange{

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(1);
        list.add(0);
        list.add(2);

        int result = numRange(list, 6,8);
        System.out.print(result);
    }

    public static int numRange(ArrayList<Integer> a, int b, int c) {
        int listSize = a.size();
        int count =0;

        for(int i=0; i<listSize; i++){
            int sum =0;
            int p = i;
            while(p<listSize){
                sum = sum + a.get(p);
                if(sum>=b && sum <=c){
                    count++;
                }

                if(sum>c){
                    break;
                }
                p++;

            }
        }

        return count;
    }
}
