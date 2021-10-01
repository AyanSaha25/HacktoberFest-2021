class NayanPatrnDIsplay4
{
	public static void main(String[]args)
	{
		int rows=5;
		for(int g=1;g<=rows;++g)
		{
			for (int h=1;h<=g;++h)
			{
				System.out.print(h%2);
			}
			System.out.println("");
	    }
		for (int g=rows-1;g>=1;--g) 
		{
			for (int h=1;h<=g;++h)
			{
				System.out.print(h%2);
		    }
			System.out.println("");
		}
	}
}
