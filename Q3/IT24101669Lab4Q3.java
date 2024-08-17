import java.util.Scanner;

	public class IT24101669Lab4Q3{
		public static  void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		String message;

			message = (number > 0) ? "The number is positive" : 
				  (number < 0) ? "The number is  Negative" :
				   "The number is zero";
	
			System.out.println(message);
	}
}	
			