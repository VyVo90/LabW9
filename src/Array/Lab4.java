package Array;

import javax.swing.JOptionPane;

public class Lab4 {

public static int RandomNumber(int maxInt){
	return 1+(int)(Math.random()*maxInt);
}

public static void main(String[] args) {
	
	int diceNumb, remainder,d=(-1);
	String oddOrEven;
	
	JOptionPane.showMessageDialog(null, "Throw a dice!");
	
	diceNumb= RandomNumber(10);
	
	oddOrEven=(JOptionPane.showInputDialog
			(null, "Do you think the number rolled is odd or even?").toLowerCase());

	remainder = diceNumb%2; 
	
	if(oddOrEven.equals("odd")||oddOrEven.equals("even")){
		switch(oddOrEven){
		case "odd":
			d=1;break;
		case "even":
			d=0;break;
		}
		if(d==remainder)
			JOptionPane.showMessageDialog(null, "You guessed correctly!");
		else
			JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
	}
	else
		JOptionPane.showMessageDialog(null, "Invalid input. Try Again.");
}

}