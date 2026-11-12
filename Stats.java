import java.util.Arrays;

public class Stats{
	public static void main (String[] args){
		int[] nums = new int[args.length];
		
		for (int i = 0; i < args.length; i++){
			nums[i] = Integer.parseInt(args[i]);
		}
		
		int count = nums.length; 
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int avg = 0;
		
		for (int i = 0; i < count; i++){
			sum += nums[i];
		}
		
		for(int i = 0; i < count; i++){
			if (nums[i] > max){
			max = nums[i];
		}
		}
		
		for(int i = 0; i < count; i++){
			if (nums[i] < min){
			min = nums[i];
		}
		}
		 avg = sum/count;
		
		System.out.printf("There are %d numbers\n", count);
		System.out.printf("The sum is %d\n", sum);
		System.out.printf("The maximum is %d\n", max);
		System.out.printf("The minimum is %d\n", min);
		System.out.printf("The average is %d\n", avg);
	}
	
	
}
