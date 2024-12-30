public class binary {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 10};
        int target = 7;
        int bs = binarysearch(arr, target);
        System.out.print(arr[bs]);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0 , end = arr.length, mid = 0;
        while(start<end) {
            mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }
}
