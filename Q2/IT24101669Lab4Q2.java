import java.util.Scanner;
	public class IT24101669Lab4Q2{

		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter exam marks (out of 100) :");
			int exammarks = scanner.nextInt();
				if(exammarks < 0)
				{
					System.out.println("Invalid input for exam marks.Terminating prigram");
				return;
				}
				else if(exammarks >= 100)
				{
					System.out.println("Invalid input for exam marks.Terminating prigram");
				return;

				}
			System.out.print("Please enter  lab submission  marks (out of 100) :");	
			int labmarks = scanner.nextInt();
				if(labmarks < 0)
				{
					System.out.println("Invalid input for lab submission marks.Terminating prigram.");
				}
				else if(labmarks >= 100)
				{
					System.out.println("Invalid input for lab submission marks.Terminating prigram.");
				}
			System.out.print("Please enter the percentage given for the exam :");
			int perexam = scanner.nextInt();
			
			System.out.print("Please enter the percentage given for the lab submission :");
			int perlab = scanner.nextInt();	
			
			int amountper = (perlab+perexam);
				if(amountper < 0)
				{
					System.out.println("The percentages must add up to 100.Terinating program");
				return;
				}
				else if(amountper > 100)
				{
					System.out.println("The percentages must add up to 100.Terinating program.");
				return;

				}

									System.out.println("");
			
									double exammarks1 = ( exammarks*perexam)/100;
									double labmarks1 = (labmarks*perlab)/100;
									double mark = ( exammarks1+labmarks1);
									System.out.print("Final Exam Maek is :"+ mark);
	}	
}