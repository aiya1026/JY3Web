public class MS2
{
	public static void main(String[] args)
	{
		//for(int i=1;i<=9;i+=2)
		//{
			//for(int j=1;j<=i;j++)
				//setLocationRelativeTo(null); 
				//System.out.print("*");
				//System.out.println("\n");

		//}

		for(int i=0;i<=5;i++){
			for(int j=0;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++){
			System.out.print("*");
			}
				System.out.println();
		}
		
	}
}