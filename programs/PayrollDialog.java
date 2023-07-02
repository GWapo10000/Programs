import javax.swing.JOptionPane;

public class PayrollDialog{

    public static void main (String[] args) {
        int gross_pay, hourly_pay_rate, hours_worked;
        String name = JOptionPane.showInputDialog("Enter Your Name Please");
        hourly_pay_rate = Integer.parseInt (JOptionPane.showInputDialog("Enter the value of hourly pay rate"));
        hours_worked = Integer.parseInt (JOptionPane.showInputDialog("Enter the value of hours worked"));
        gross_pay=hours_worked*hourly_pay_rate;
        JOptionPane.showMessageDialog(null,
            name +  "your Gross pay is " + gross_pay + " for " + hours_worked + " hours of work");
    }

}