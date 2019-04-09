public class HollowSquare
{
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++){
		System.out.print("*"+"\t");


		for(int j=0;j<=9;j++){
		if(i==0 || i==10 || j==9)
		System.out.print("*"+"\t");
		else{
		System.out.print(" "+"\t");
		}
		}
		System.out.println("\n"+"\n"+"\n");
		}
		//"\n"+"\n"+"\n"
				
}
}