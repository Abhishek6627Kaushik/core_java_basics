class C 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1 = new C();

		final C c2 = new C();
		c2 = new C();
		System.out.println("done");
	}
}
