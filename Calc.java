public class Calc {
	public static void main(String[] args){
		int[] nums = new int[args.length - 1];
		String arg = args[0];
		 for (int i = 1; i < args.length; i++){
			 nums[i - 1] = Integer.parseInt(args[i]);
		 }
		 
		 if (args.length < 2){
			 System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
		 }
		 
		 if (arg.equals("add")){
			 System.out.println(add(nums));
		 } else if (arg.equals("mult")){
			 System.out.println(mult(nums));
		 } else if (arg.equals("max")){
			 System.out.println(max(nums));
		 } else if (arg.equals("min")){
			 System.out.println(min(nums));
		 } else System.err.println("Unknown operation: " + arg);

	}
	
	public static int add (int[] nums){
		int ans = 0;
		for (int i = 0; i < nums.length; i++){
			ans += nums[i];
		}
		return ans;
	}
	
	public static int mult (int[] nums){
		int ans = 1;
		for (int i = 0; i < nums.length; i++){
			ans *= nums[i];
		}
		return ans;
	}
	
	public static int max (int[] nums){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] > max){
				max = nums[i];
			}
		}
		return max;
	}
	
	public static int min (int[] nums){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] < min){
				min = nums[i];
			}
		}
		return min;
	}
}
