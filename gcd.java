class gcd
{
    public static void main(String args[])
    {
        int a=12,b=18;
        while(b!=0){
        int r=a%b;
        a=b;
        b=r;
    }
    System.out.println(a);
    }
}