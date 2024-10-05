
public class character {
    public static void main(String[] args) {
        char[] arr = {'a','s','d','q'};
        char target = 's';
        System.out.println(Sea(arr,target));
    }

    static boolean Sea(char[] arr,char target) {
        int start = 0, end = arr.length -1, mid =0;
        while(start<=end) {
            mid = start +(end - start) /2;
            // if(arr[mid] == target) {
            //     return true;
            // }
            if(arr[mid]<target) {
                start = mid + 1;
            } else if(arr[mid]> target) {
                end = mid -1;
            } else {
                return true;
            }
        }
        return false;
    }
}
