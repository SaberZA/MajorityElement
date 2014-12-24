/**
 * Created by Sab3r on 2014/12/24.
 */
public class Solution {

    public static int majorityElement(int[] num) {
        if(num.length == 1){
            return num[0];
        }

        bubbleSort(num);

        int ceil = (int)(num.length / 2.0);
        return num[ceil];
    }

    private static int[] bubbleSort(int[] num) {
        boolean swapped;
        int n = num.length;
        do {
            swapped = false;
            for (int i = 1; i <= n-1; i++) {
                if (num[i-1] > num[i]){
                    swap(num,i);
                    swapped = true;
                }
            }
            n = n - 1;
        }while(swapped);

        return num;
    }


    private static void swap(int[] num, int i) {
        int temp = num[i];
        num[i] = num[i-1];
        num[i-1] = temp;
    }
}
