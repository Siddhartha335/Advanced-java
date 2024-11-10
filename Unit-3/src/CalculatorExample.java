import javax.swing.*;
import java.awt.*;

public class CalculatorExample extends JFrame {
    JLabel lbl;
    JButton btn;

    String[] buttonName = {"sum", "diff", "mult" ,"div", "res", "total"};
    public CalculatorExample() {
        setTitle("Calculator");
        setSize(300,300);
        setLayout(new GridLayout(3,5));
        for (int i = 1; i < 10; i++) {
            lbl = new JLabel(String.valueOf(i));
            lbl.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            add(lbl);
        }
        for (String btns:buttonName) {
            btn = new JButton(btns);
            add(btn);
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalculatorExample();
    }
}
