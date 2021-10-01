class NayanPatrn2
{
	public static void main(String[]args)
	{
		int a,s,r=5;
		for(a=0;a<r;a++)
		{
			for(s=r-a;s>0;s--)
			{
				System.out.print(" ");
		    }
		for(s=0;s<=a;s++)
		{
			System.out.print(" *");
		}
		System.out.println();
	    }
    }
}