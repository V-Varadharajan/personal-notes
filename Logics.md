import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // ArrayList<Integer> newVal = new ArrayList<Integer>(5);
        // Scanner in = new Scanner(System.in);
        // for(int i = 0; i < 5; i++) {
        // newVal.add(in.nextInt());
        // }
        // System.out.println("ArrayLSit values are here " + newVal);
        int val = 12345;
        int rev = 0;
        // Iteration 1
        rev = rev * 10 + val % 10; 
        val = val / 10;
        System.out.println("ff "+ rev);
        System.out.println("ff "+ val);
        // Iteration 2
        rev = rev * 10 + val % 10;
        val = val / 10;
        System.out.println("ss "+ rev);
        System.out.println("ss "+ val);
    }
}
