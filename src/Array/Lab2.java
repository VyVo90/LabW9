package Array;
import javax.swing.JOptionPane;

public class Lab2 {

		public static void main(String[] args) {
			int diceNumb, remainder, d=-1, roundsPlayed=0;
			int winNumb=0, oddNumb=0, evenNumb=0, maxRounds=9;
			String oddOrEven, likeToPlayAgain;
			boolean playAgain=false;
			String[] guess  = new String[maxRounds];
			String[] compNumb  = new String[maxRounds];
			String[] winOrLose = new String[maxRounds];
					
			do
			{
				JOptionPane.showMessageDialog(null, "Let's play a game!");
				diceNumb= 1+(int)(Math.random()*6); 
				oddOrEven=(JOptionPane.showInputDialog(null,
						"Do you think the number rolled is odd or even?").toLowerCase());
		
				remainder = diceNumb%2; 
				
				if(oddOrEven.equals("odd")||oddOrEven.equals("even"))
				{
					switch(oddOrEven)
					{
					case "odd":
						d=1; oddNumb++;
						guess[roundsPlayed]="odd";
						break;
					case "even":
						d=0; evenNumb++;
						guess[roundsPlayed]="even";
						break;
					}
					
					if(d==remainder){
						winNumb++;
						winOrLose[roundsPlayed]="won round " +(roundsPlayed+1);
						JOptionPane.showMessageDialog(null, "You guessed correctly!");
					}
					else{
						winOrLose[roundsPlayed]="lost round " +(roundsPlayed+1);
						JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
					}
					compNumb[roundsPlayed]=Integer.toString(diceNumb);//results
					
					if(roundsPlayed<maxRounds)
					{
						likeToPlayAgain= JOptionPane.showInputDialog
								(" Would you like to play again? Yes=y or No=n");
						
						if(likeToPlayAgain.toLowerCase().equals("y")
								||likeToPlayAgain.toLowerCase().equals("yes"))
							playAgain=true;
						else
							playAgain=false;	
					}
					roundsPlayed++;
		
					if(!playAgain)
					{
						String message ="Game History: ";
						String message2= " ";
						message2 = message2.format("\n Overall you won %s times. "
								+ "Chose odd %s times and even %s times. ", winNumb,oddNumb,evenNumb);
						
						for(int i=0; i<guess.length; i++)
						{	
							if(guess[i]==null){
							}
							else{
								message = message.format(message+"\n You %s by choosing %s. Computer chose %s. ", 
										winOrLose[i],guess[i],compNumb[i] );
							}
						}
						JOptionPane.showMessageDialog(null, message+message2);	
					}		
				}
				else
				{	
					JOptionPane.showMessageDialog(null, "Error. Try Again.");
					playAgain=true;
				}

			}while(playAgain);
		}
	}
