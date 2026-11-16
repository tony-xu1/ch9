public class Longest{
	public static void main (String[] args){
		 int longest = 0;
		 int indexOfLongest = 0;
		 for (int i = 0; i < args.length; i++){
			 if (args[i].length() > longest){
				 longest = args[i].length();
				 indexOfLongest = i;
			 }
		 }
		 
		int indexOfFirst = 0;
		int diff = 0;
		for (int i = 1; i < args.length; i++){
					if (args[i].compareTo(args[indexOfFirst]) < 0){
						indexOfFirst = i;
					} 
			}
		 
		 System.out.println("Longest: " + args[indexOfLongest] + " (" + args[indexOfLongest].length() + " " + "letters)");
		 System.out.println("First alphabetically: " + args[indexOfFirst]);
	}
	
}
