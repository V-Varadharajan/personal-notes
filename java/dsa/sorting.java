//Bubble sort Algorithm
import java.util.*;

class Main {
    static int[] sorting(int[] arr, int n) {
        int temp;
        for(int i = 0; i < n -1; i++) {
            boolean is = false;
            for(int j = 0; j < n -i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    is = true;
                }
            }
            if(!is) {
                break;
            }
        }
        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {21,32,9,2,5 };
        int len = arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sorting(arr,len)));
    }
}
