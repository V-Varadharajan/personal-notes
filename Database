import java.util.*;

class Database {
    int a; //state variable
    String b;
    void display(){
        System.out.println("Role number :" + a);
        System.out.println("Name number :" + b);
        System.out.println();
    }
    static int i; // static variable 
    static int value() { 
        i++;  // add student value by 1 if this method called!
        return i;
    }
    public static void main(String[] args) {
        Database ad1 = new Database(); // calling object
        ad1.a = 10;
        ad1.b = "hari";
        System.out.println(value()); // It don't need for object calling bcs we decleared value method as a static, so we don't want to call it as like 
        ad1.display();
        Database ad2 = new Database();
        ad2.a = 23;
        ad2.b = "varadha";
        System.out.println(value());
        ad2.display();
    }
}
