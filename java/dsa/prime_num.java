public class prime_num {
    public static void main(String[] args) {
        prime_num obj = new prime_num();
        for(int i = 2; i < 100; i++) {
            boolean is = obj.prime(i);
            if(is) {
                System.out.println(i);
            }
        }
    }
    public boolean prime(int i) {
            int c = 2;
            while(c * c <= i) {
                if(i% c == 0) {
                    return false;
                }
                c++;
            }
            return true;
    }
}
