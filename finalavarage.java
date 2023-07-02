import javax.swing.*;

public class finalavarage{
	
	public static void main(String[]args){
		
		String studentName;
		String studentInputString;
		int studentGrades;
		double studentFinalAvarage;
		
		studentName = JOptionPane.showInputDialog("Please enter your Student Name:");
		
		studentInputString = JOptionPane.showInputDialog("Please enter your Prelim Grade:");
		
		studentInputString = JOptionPane.showInputDialog("Please enter your Midterm Grade:");
		
		studentInputString = JOptionPane.showInputDialog("Please enter your Semi Final:");

		studentInputString = JOptionPane.showInputDialog("Please enter your Final:");


		 studentGrades = Integer.parseInt(studentInputString);

		 studentFinalAvarage = studentGrades*4/4;
		 
		
		JOptionPane.showMessageDialog(null, studentName + "Total Avarage Grade: " + studentFinalAvarage);
		 
		if ( studentGrades >= 75 )
			 JOptionPane.showMessageDialog(null, " Your Avarage " + studentGrades + " is Passed!", "Congrats",  JOptionPane.INFORMATION_MESSAGE);
		 
		 else { 
			 JOptionPane.showMessageDialog(null, "Your Avarage is " + studentGrades + "  Failed!", "BAGSAK KA!!!", JOptionPane.ERROR_MESSAGE);
		 }
		System.exit(0);


		

	}
}