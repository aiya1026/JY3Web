import java.util.*;
public class LiLv
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入存款年份:");
		int years = scanner.nextInt();
		//int year = 5;
		double lilv = 7.7/100;
		double shiji = lilv;
		if(years<=1){
			shiji = lilv * 0.5;
		}
		else if(years<=3){
			shiji = lilv * 0.7;
		}
		else if(years<=5){
			shiji = lilv * 1;
		}
		else{
			shiji = lilv * 1.1;
		}
		System.out.println("您的年利率为:"+shiji);

	}
}