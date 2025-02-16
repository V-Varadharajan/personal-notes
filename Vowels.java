public class Vowels {
    public static void main(String[] args) {
        String a = "Welcome";
        String b = "";
        char c;
        for(int i = 0; i<=a.length() - 1; i++) {
            c = a.charAt(i);
            if(search(c)) {
                b += c; 
            }
        }
        System.out.println(b);
    }

    static boolean search(int val) {
        if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' ) {
            return false;
        } else if(val == 'A' || val == 'E' || val == 'I' || val == 'O' || val == 'U') {
            return false;
        }
        return true;
    }
}
