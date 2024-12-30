

class pivote {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        int start = 0, end = arr.length -1;
        int a = pivotee(arr,start,end);
        System.out.println(a);
        }
    static int pivotee(int[] arr,int start,int end) {
        while(start <= end) {
            int mid  = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid + 1;
            }
            if(arr[start]<=arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int alen = arr.length;
        return alen;
    }
}