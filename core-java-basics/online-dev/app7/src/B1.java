class B1
{
	public static void main(String[] args) 
	{
		int i = 0;
		if(i++ == 1)
		{
			System.out.println("if block:" +  i++);
			i++;
		}
		System.out.println("main:" + i);
	}
}
//main: 1