public class sample {

    public static void main(String[] args)
    {
        boolean isPal = isPalindrome(121);
        
    }
    public static boolean isPalindrome(int x) 
    {
        int temp = 0,rem=0,copy = x;
        while(x >= 1)
        {
            rem = x % 10;
            temp += rem;
            x = x/10;
        }
        boolean isPalindrome = false;
        if(copy == temp)
        {
            isPalindrome = true;
        }      
        return isPalindrome;
    } 
    
}
