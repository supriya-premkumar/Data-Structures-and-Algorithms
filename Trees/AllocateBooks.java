public class Solution {
    public int books(ArrayList<Integer> a, int b) {
        int low = getMax(a);
        int high = getSum(a);
        f(a.size() < b)
        return -1;


        while(low < high) {
            int mid = (int)(low + (high-low)/2);
            System.out.println("For Mid = " + mid +" \n low = " + low + "\n high = " +  high);
            int requiredReaders = getReaders(a, mid);
            if(requiredReaders <= b) {
                high = mid;
                System.out.println("\t high = " + high);
            }
            else {
                low = mid + 1;
                System.out.println("\t low = " + low);
            }
        }
        return low;
    }
    public static int getReaders(ArrayList<Integer> a, int maxLengthPerReader) {
        int total = 0;
        int readers = 1;
        for(int i = 0; i < a.size(); i++) {
            total += a.get(i);
            if(total > maxLengthPerReader) {
                total = a.get(i);
                readers++;
            }
        }
        return readers;
    }

    public static int getMax(ArrayList<Integer> a) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            max = Math.max(a.get(i), max);
        }
        return max;
    }

    public static int getSum(ArrayList<Integer> a) {
        int total = 0;
        for(int i = 0; i < a.size(); i++) {
            total += a.get(i);
        }
        return total;
    }


}
