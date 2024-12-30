import java.util.*;

class roman {
    public static void main(String[] args) {

        String s = "VIIXC";
        HashMap<Character, Integer> roadmap = new HashMap<>();
        roadmap.put('I', 1);
        roadmap.put('V', 5);
        roadmap.put('X', 10);
        roadmap.put('L', 50);
        roadmap.put('C', 100);
        roadmap.put('D', 500);
        roadmap.put('M', 1000);
        int res = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            int val = roadmap.get(s.charAt(i));

            if(i < len -1 && val < roadmap.get(s.charAt(i + 1))) {
                res -= val; 
            } else {
                res += val;
            }
        }
        System.out.println(res);
    }
}