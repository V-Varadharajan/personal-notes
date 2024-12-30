
import java.util.Arrays;

class Binary2d {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {12,23,33},
            {15,26,35}
        };
        System.out.println(Arrays.toString(search(arr,26)));
    }

    static int[] search(int[][] arr,int target) {
        int r = 0, c = arr.length -1;
        while(r < arr.length && c >= 0) {
            if(arr[r][c] == target) {
                return new int[]{r,c};
            }
            if(arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
