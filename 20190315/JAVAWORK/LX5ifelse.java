import java.util.*;
public class LX5ifelse
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������ĳɼ�:");
		int score = scanner.nextInt();

		if(score>100 || score<0){
			System.out.println("superman");
		}
		else if(score>=90 && score<=100){
			System.out.println("����");
		}
		else if(score>=80 && score<90){
			System.out.println("����");
		}
		else{
			System.out.println("������");
		}

	}
}