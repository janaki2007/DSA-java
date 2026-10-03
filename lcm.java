class lcm
{
    public static void main(String args[])
    {
        int a=12,b=18;
        int lcm=a;
        while(lcm%b!=0)
        {
            lcm=lcm+a;
        }
        System.out.println(lcm);
    }
}