//Selection sort

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
        System.out.println(Arrays.toString(selection(arr)));
    }
    
    static int[] selection(int[] arr) {
        int start = 0, end = arr.length -1;
        for(int i = 0; i<=end; i++) {
            int max = max(arr, end);
            swap(arr,max,end);
            end--;
        }
        return arr;
    }
    
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
    static int max(int[] arr, int end) {
        int max = 0;
        for(int i=1; i<=end; i++) {
            if(arr[max]<arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
