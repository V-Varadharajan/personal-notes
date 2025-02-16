public class Mountain {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0,1},
            {1,0,1,1},
            {1,0,0,1},
            {0,1,0,0}
        };
        System.out.println(finding_mountain(arr));
    }

    static int finding_mountain(int[][] arr) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                if(arr[i][j] == 1) {
                    count += 1;
                    scan(arr,i,j);
                }
            }
        }
        return count;
    }

    static void scan(int[][] arr,int i,int j) {

        if(i<0 || i>=arr.length || j<0 || j>=arr[i].length || arr[i][j] == 0) {
            return;
        }
        arr[i][j] = 0;

        scan(arr, i+1,j);
        scan(arr, i-1,j);
        scan(arr, i,j+1);
        scan(arr, i,j-1);
    }
}
