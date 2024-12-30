class sample 
{
    public static void main(String[] args)
    {
        boolean isPal = isPalindrome(121);
        
    }
    public static boolean isPalindrome(int x) 
    {
        int temp = 0,rem=0,copy = x;
        while(x > 0)
        {
            rem = x % 10;
            temp =temp*10 + rem;
            x = x/10;
        }
        boolean isPalindrome = (copy == temp) ? true : false;
        return isPalindrome;
    } 
}
