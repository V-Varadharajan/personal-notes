public class Summa {
    public static void main(String[] args) {
       int[][] arr = {
        {1,0,1},
        {0,1,0},
        {1,0,1}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(change_value(arr,i,j) + " ");
            }
            System.out.println();
        }
    }

    static int change_value(int[][] arr, int i, int j) {
        if(arr[i][j] == 1) {
            return arr[i][j] = 0;
        } else {
            return arr[i][j] = 1;
        }
    }
}



// String a = "abcde";
//         String b = "";
//         char c;
//         for(int i = a.length() -1; i>=0 ; i--) {
//             c = a.charAt(i);
//             b += c;
//         }
//         System.out.println(b);
