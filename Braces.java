public class Braces {
    public static void main(String[] args) {
        String a = "(WElcome to) world. how to(prepare for interview)!.. (Study for it) (";
        char b;
        int c1 =0, c2 =0;
        for(int i = 0 ; i<= a.length() - 1; i++) {
            b = a.charAt(i);
            if(b == '(') {
                c1++;
            } else if(b == ')') {
                c2++;
            }
        }
        if(c1 == c2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE " + c1  +" " + c2);
        }
    }
}
