package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial extends JFrame implements ActionListener {
    JLabel num,result,display;
    JTextField txt;
    JButton facto;
    public Factorial() {
        setTitle("Factorial Frame");
        setSize(300,300);
        setLayout(new GridLayout(3,2,5,5));
        num = new JLabel("Enter num:");
        txt = new JTextField(5);
        result = new JLabel("Result:");
        display = new JLabel();
        facto = new JButton("Compute");
        facto.addActionListener(this);
        add(num);
        add(txt);
        add(result);
        add(facto);
        add(display);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    static int facto(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        else {
            return n * facto(n-1);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int results = facto(Integer.parseInt(txt.getText()));
        display.setText(String.valueOf(results));
    }

    public static void main(String[] args) {
        new Factorial();
    }
}
