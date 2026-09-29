class pal {
    public static void main(String[] args) {
        int n=121,
        temp=n,
        rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("The number is a palindrome.");
        }
        else
        {
            System.out.println("The number is not a palindrome.");
        }
    }
}