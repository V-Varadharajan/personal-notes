import java.util.Arrays;

public class demo {
    int[] start;
    demo(){
        start = new int[] {2,3,344,5,5,554};
    }
    void value() {
        Arrays.sort(start); // Sort the array in place
        System.out.println(Arrays.toString(start)); // Print the sorted array
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.value();
    }
}
