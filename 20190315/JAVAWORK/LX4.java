//���������
import java.util.*;
public class LX4
{    
	public  static void main(String[] args)
	{
		//char c=(char)(int)(Math.random()*26+65);
		//System.out.println(c);
		Random r = new Random();
		int rInt = r.nextInt(26);
		//System.out.println(rInt);
		char c = (char)('A' + rInt);
		System.out.println(c);

		
	}
}