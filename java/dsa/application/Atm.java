import java.util.*;

public class Atm {
    public static void main(String[] args) {
        int maxCount =3;
        int Tcash = 100;
        boolean is  = false;
        
        System.out.println("Enter your pin :");

        Scanner in = new Scanner(System.in);
        for(int i= 3;i >0;i--) {
            int inn = in.nextInt();
            if(checkAuth(inn) == false && maxCount >= 0) {
                maxCount--;
                System.out.println("Wrong pin" + maxCount);
            } else {
            System.out.println("Correct pin :");
                is = true;
                break;
            }
        }
        if(is) {
            System.out.println("Enter the value to withdraw : ");
            int value = in.nextInt();
            if(value <= Tcash) {
                Tcash -= value;
                System.out.println("Avalable cash : " + Tcash + "Cash you withdraw :" + value);
            } else {
                System.out.println("You don't have that much money in your wallet! \n PLEASE TRY AGAIN !");
            }
        }
    }
    static boolean checkAuth(int pin) {
        return (pin == 1111);
    }
}