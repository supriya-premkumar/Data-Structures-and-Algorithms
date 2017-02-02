/*************************************************************
 * *******************DESRCIPTION*****************************
 *For Given Number N find if its COLORFUL number or not

 Return 0/1

 COLORFUL number:

 A number can be broken into different contiguous sub-subsequence parts.
 Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
 And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different
 Example:

 N = 23
 2 3 23
 2 -> 2
 3 -> 3
 23 -> 6
 this number is a COLORFUL number since product of every digit of a sub-sequence are different.

 Output : 1
 *
 *
 *
 *
 **************************************************************/






import java.util.*;

public class ColorfulNumber{
    public static void main(String[] args){
        System.out.print(colorful(234));
    }

    public static int colorful(int num){
        int rem =0;

        ArrayList<Integer> numList = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        if(num<=0){
            return 0;
        }

        while(num > 0){
            rem = num%10;
            numList.add(rem);
            num = num/10;
            if(num == rem){
                return 0;
            }

        }

        int size = numList.size();

        for(int i =0; i<size; i++){
            for(int j = i; j<size; j++){
                int prod =1;
                for(int k=i; k<=j; k++){
                    prod = prod * numList.get(k);
                }

                if(hashSet.contains(prod)){
                    return 0;
                }else{
                    hashSet.add(prod);
                }


            }
        }


        return 1;
    }
}