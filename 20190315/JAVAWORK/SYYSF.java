import java.util.*;
public class SYYSF
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入数据条数:");
		int total = sca.nextInt();
		int size = 10;
		int page =total%size==0 ? total/size : total/size+1;
		System.out.println(page);
	}

}