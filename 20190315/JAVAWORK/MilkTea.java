import java.util.*;
public class MilkTea
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ҫ��ı���:");
		int shop = scanner.nextInt();
		int price = 6;
		int pay = 6;

		if(shop < 1){
			System.out.println("����");
			return;
		}
		if(shop > 1){
			pay = price + (shop-1) * price/2;
		}
		System.out.println("֧�����:"+pay);

	}
}