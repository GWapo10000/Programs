import javax.swing.*;
import javax.swing.JOptionPane;

public class GradingSystem{


public static void main(String args[]) {

final JPanel panel = new JPanel();
String get1,get2,get3,get4;

double prelim=0.00, midterm=0.00, semifinal=0.00, finals=0.00;
double calculate=0.00, Point=0.00;

String reply="No";

do
{
    JOptionPane.showMessageDialog(panel, "           Grade System Using JOptionPane in Java   \n\n"
    	    + "                              Created By     \n\n"
    	    + "Marjorie Earl Cabugsa, BSIT Southern Philippines College\n\n", "Grading System",
        JOptionPane.INFORMATION_MESSAGE);

String name = JOptionPane.showInputDialog(null,"Enter Your Name Please");
    
get1 = JOptionPane.showInputDialog(null,"Enter your Prelim Grade :");
prelim=Double.parseDouble(get1);	
	
get2 = JOptionPane.showInputDialog(null,"Enter your Midterm Grade :  ");
midterm=Double.parseDouble(get2);

get3 = JOptionPane.showInputDialog(null,"Enter your Semi-Final Grade : ");
semifinal=Double.parseDouble(get3);

get4 = JOptionPane.showInputDialog(null,"Enter your Finals Grade : ");
finals=Double.parseDouble(get4);

calculate= (prelim * 0.25) + (midterm* 0.25) + (semifinal * 0.25) + (finals * 0.25);
if(Math.round(calculate)>=98&&Math.round(calculate)<=100)
{
    Point=1;
    JOptionPane.showMessageDialog(null, "Name: " + name + "\n Total Average Grade: Excellent " + calculate + " Graade Points: " + Point + "\n WOW! You got the Highest Grade");
}
if(Math.round(calculate)>=96 && Math.round(calculate)<97)
{
    Point=1.25;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Very Good" + calculate + " Graade Points: "  + Point + "\n Don't Stop Keep it up");
}
if(calculate>=93.00 && calculate<95.00)
{
    Point=1.5;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Very Good" + calculate + " Graade Points: "  + Point + "\n Go for it");
}
if(Math.round(calculate)>=90.00 && Math.round(calculate)<92.00)
{
    Point=1.75;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Good" + calculate + " Graade Points: "  + Point + "\n Go for it");
}
if(Math.round(calculate)>=87 && Math.round(calculate)<89)
{
    Point=2.00;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Good" + calculate + "Graade Points: " + Point + "\n Go for it");
}
if(Math.round(calculate)>=84&&Math.round(calculate)<86)
{
    Point=2.25;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Satisfactory" + calculate + " Graade Points: "  + Point + "\n Keep it Up!!");
}
if(Math.round(calculate)>=81&& Math.round(calculate)<83)
{
    Point=2.5;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Satisfactory" + calculate + " Graade Points: "  + Point + "\n Keep it Up!!");
}
if(Math.round(calculate)>=78&&Math.round(calculate)<80)
{
    Point=2.75;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Passed" + calculate + " Graade Points: "  + Point + "\n You Passed");
}
if(Math.round(calculate)>=75 &&Math.round(calculate)< 77)
{
    Point=3;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Passed" + calculate + " Graade Points: "  + Point + "\nYou Passed");
}
if(Math.round(calculate)>=61&&Math.round(calculate)<74)
{
    Point=4.0;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Conditonal" + calculate + " Graade Points: "  + Point + "\n You still have your chance Please Talk to your Subject teacher.");
}
if(Math.round(calculate)<60)
{
    Point=5.0;
    JOptionPane.showMessageDialog(null, "Name: " + name +  "\n Total Average Grade: Fail" + calculate + " Graade Points: "  + Point + "\n You Failed");
}

	reply =	JOptionPane.showInputDialog(null,"Try Again? (Select Yes or No) ");
	}while (reply.matches("Yes") || reply.matches("YES") );
JOptionPane.showMessageDialog(null,"End of Program"  );

	}
}