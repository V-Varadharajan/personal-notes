class Except {
    public static void main(String[] args) {
        int i = 10;
        try {
            i = i / 0;
            System.out.println(i);
        } catch (Exception e) {
            i = i / 10;
            System.out.println(" exception handling working good" + i);
        } 
    }
}