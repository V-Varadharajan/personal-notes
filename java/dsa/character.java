public class character {
    public static void main(String[] args) {
    char[] arr = {'a','s','d','q'};
    char target = 'q';
    System.out.println(Sea(arr,target));
}

static int Sea(char[] arr,char target) {
    int start = 0, end = arr.length -1, mid =0;
    while(start<=end) {
        mid = start +(end - start) / 2;
        if(arr[mid]<target) {
            start = mid + 1;
        } else if(arr[mid] > target) {
            end = mid -1;
        } else {
            return mid;
        }
    }
    // return (char)arr[start];
    // return (char)arr[start % arr.length];
    return mid;
}
}

// FINDING THE PERFECT MATCH OF THE CHARACTER SEQUENCE!
// public static void main(String[] args) {
//     char[] arr = {'a','s','d','q'};
//     char target = 's';
//     System.out.println(Sea(arr,target));
// }

// static boolean Sea(char[] arr,char target) {
//     int start = 0, end = arr.length -1, mid =0;
//     while(start<=end) {
//         mid = start +(end - start) /2;
//         // if(arr[mid] == target) {
//         //     return true;
//         // }
//         if(arr[mid]<target) {
//             start = mid + 1;
//         } else if(arr[mid]> target) {
//             end = mid -1;
//         } else {
//             return true;
//         }
//     }
//     return false;
// }

// public static void main(String[] args) {
//     char[] arr = {'a','b','f','f','f','f','h'};
//     char target = 'f';
//     int val[] = {-1,-1};

//     val[0] = value(arr, target, true);
//     if(val[0] != -1) {
//         val[1] = value(arr, target, false);
//     }
//     System.out.println(Arrays.toString(val));
//  }
//  static int value(char[] arr,char target, boolean a) {
//     int start = 0, end = arr.length -1, mid =0;
//     int sum = 0;
//     while(start<=end) {
//         mid = start +(end - start) / 2;
//         if(arr[mid]<target) {
//         start = mid + 1;
//         } else if(arr[mid]> target) {
//         end = mid -1;
//         } else {
//             sum = mid;
//             if(a) {
//                 end = mid -1;
//             } else {
//                 start = mid + 1;
//             }
//          }
//     }
// return sum;
// }