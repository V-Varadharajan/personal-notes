class Char {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','f'};
        int value = Export(arr);
        System.out.println(arr[value]);
    }

    static int Export(char[] arr) {
        int max = arr[0];
        for(int i =0;i<arr.length; i++) {
            if(max < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
