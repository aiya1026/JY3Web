import java.util.*;
public class ChooseSort
{
	public static void main(String[] args)
	{
		int[] nums ={-1,999,100,500};
		int[] newArr = chooseSort(nums);
		System.out.print(Arrays.toString(newArr));
	}
		public static int[] chooseSort(int[] nums)
		{
			for(int i=0;i<nums.length-1;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]>nums[j]){
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
				}

			}
			

		}
		return nums;
		
	}
}