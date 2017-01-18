import java.util.*;

public class Checkpoint3_kthSmallestElement{
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(0);
        int count = kthsmallest(integerList, 3);
        System.out.println(count);

    }

    public static int kthsmallest(final List<Integer> a, int k){
        List<Integer> smallestElements = new ArrayList<Integer>();
        for(Integer num: a){
            if(num< k){
                if(smallestElements.contains(num)){
                    continue;
                }
                smallestElements.add(num);
            }
        }
        return smallestElements.size();
    }

}

A : [ 8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92 ]
B : 9