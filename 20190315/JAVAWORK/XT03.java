class XT03 
{
	public static void main(String[] args) 
	{   
		int a = 1;
		a = a++;
		System.out.println(a);

		int b = 1;
		b = ++b;
		b = b++;
		b = b++ + ++b;
		System.out.println(b-- + ++b + b++ +b);
		System.out.println(b);
	}
}

