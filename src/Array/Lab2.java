package Array;

import java.util.Scanner;

public class Lab2 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int computerdice;
			int computerst;
			int play = 0;
			int countturn = 0;
			int countwin = 0;
			int winpercent;
			int counteven = 0;
			int countodd = 0;
			int oddpercent;
			int evenpercent;
			String turn = "yes";
			String playerguess;
			int player = 0;
			int i;
			
			int [] aryNums = new int[10];
			aryNums [0] = 1;
			aryNums [1] = 2;
			aryNums [2] = 3;
			aryNums [3] = 4;
			aryNums [4] = 5;
			aryNums [5] = 6;
			aryNums [6] = 7;
			aryNums [7] = 8;
			aryNums [8] = 9;
			aryNums [9] = 10;
			
			for(i=0; i < aryNums.length; i++)
		{System.out.println("Num:" + aryNums[0]);}
			
			while (turn.toLowerCase().equals("yes")) {
				System.out.println("******Welcome to guess odd or even******");
				computerdice = 1 + (int) (Math.random() * 10);
				System.out.print("please guess the number is odd or even: ");
				playerguess = input.next();
				// 1= odd,2= even;
				
				if (playerguess.toLowerCase().equals("odd"))
					player = 1;
				else if (playerguess.toLowerCase().equals("even"))
					player = 2;
				System.out.println("Random number is :" + computerdice);
				computerst = computerdice % 2;
				if (computerst == 2)
					counteven++;
				else
					countodd++;
				if (player == computerst) {
					System.out.println("******Correct!! You won!!******");
					countwin++;
				} else
					System.out.println("******Wrong!! You lose!!******");

				countturn++;
				
				oddpercent = (countodd * 100) / countturn;
				evenpercent = (counteven * 100) / countturn;
				System.out.println("Percent of odd:" + oddpercent);
				System.out.println("Percent of even:" + evenpercent);
				System.out.println("Number of gameplayed:" + countturn);
				winpercent = (countwin * 100) / countturn;
				System.out.println("Your Winning percent:" + winpercent);
				System.out.println("Do you want to play again(Yes/No):");
				
				turn = input.next();

			}

		}
	}
