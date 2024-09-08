package dialogPackage;

import javax.swing.*;

public class JOptionPaneDemo {

    public static void main(String[] args) {
//        JOptionPane dialog=null;
        int num1,num2,sum;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1","0"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2","0"));
        sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"The summation is: "+ sum,"Addition",JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showConfirmDialog(null,"The summation is: "+ sum,"Addition",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
    }
}
