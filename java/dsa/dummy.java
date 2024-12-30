public class dummy {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,0,8};
        int val = 2;
        int start = val +1, count = 0;
        while(start < arr.length) {
            count += arr[start];
            start++;
        } 
        System.out.println(count);
    }
}
