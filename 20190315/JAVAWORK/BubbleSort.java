import java.util.*;
public class  BubbleSort
{
	public static void main(String[] args)
	{
		int[] nums = {
			-1,0,999,100,-2
		};
		int[] newArr = bubbleSort(nums);
		System.out.print(Arrays.toString(newArr));
	}
	//ð�����򷽷�
	public static int[] bubbleSort(int[] array)
	{ 
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
 