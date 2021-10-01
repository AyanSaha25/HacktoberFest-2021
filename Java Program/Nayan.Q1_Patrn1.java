class NayanPattern1
{
	public static void main(String[]args)
	{
		for(int a=0;a<8;a++)
		{
			if(a%2==0)
			{
				continue;
			}
			else
			{
				System.out.println("**");
			}
		}
	}
}