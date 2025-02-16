

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 5 DIGITS :");
        int[] arr = new int[5];
        for(int i = 0; i <5; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("'YOU ENTERED 5 NUMBERS " + Arrays.toString(arr));

        ArrayList list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
            if(odd(arr[i])) {
                list.add(arr[i]);
            }
        }
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next()+" ");
        }
        System.out.println("Data of index : " + list.get(2));
    }

    static boolean odd(int val) {
        if(val%2 == 0) {
            return false;
        }
        return true;
    }
}
