class NayanDisPatrn3
{
    public static void main(String[]args)
    {
        int x,y,a=5;
        for(x=1;x<=a;x++)
        {
            for(y=x;y<=a-1;y++)
            {
                System.out.print(" ");
            }
            for(y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            for(y=x-1;y>=1;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
