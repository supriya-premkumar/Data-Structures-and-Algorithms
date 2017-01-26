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