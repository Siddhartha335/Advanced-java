package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterDemo extends KeyAdapter {
    JLabel firstlbl,secondlbl,result;
    JTextField firsttxt,secondtxt,resulttxt;
    JFrame frame;

    public KeyAdapterDemo() {
        frame = new JFrame();
        frame.setTitle("KeyEvent Frame");
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(3,2,4,4));
        firstlbl = new JLabel("First num");
        secondlbl = new JLabel("Second num");
        result = new JLabel("Result");
        firsttxt = new JTextField(20);
        secondtxt = new JTextField(20);
        resulttxt = new JTextField(20);
        resulttxt.addKeyListener(this);
        frame.add(firstlbl);
        frame.add(secondlbl);
        frame.add(firsttxt);
        frame.add(secondtxt);
        frame.add(result);
        frame.add(resulttxt);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int a,b,c=0;
        a = Integer.parseInt(firsttxt.getText());
        b = Integer.parseInt(secondtxt.getText());
        char choice = e.getKeyChar();
        switch (choice) {
            case '+':
                c=a+b;
                result.setText(String.valueOf(c));
                break;
            case '-':
                c = Math.abs(a-b);
                result.setText(String.valueOf(c));
                break;
            case '*':
                c = a*b;
                result.setText(String.valueOf(c));
                break;
            case '/':
                c = a/b;
                result.setText(String.valueOf(c));
                break;
            default:
                result.setText("Invalid Choice");
        }
        result.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }

}
