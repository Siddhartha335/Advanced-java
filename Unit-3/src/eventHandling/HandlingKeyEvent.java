package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HandlingKeyEvent extends JFrame implements KeyListener {
    JLabel firstlbl,secondlbl,result;
    JTextField firsttxt,secondtxt,resulttxt;
    public HandlingKeyEvent() {
        setTitle("KeyEvent Frame");
        setSize(500,400);
        setLayout(new GridLayout(3,2,4,4));
        firstlbl = new JLabel("First num");
        secondlbl = new JLabel("Second num");
        result = new JLabel("Result");
        firsttxt = new JTextField(20);
        secondtxt = new JTextField(20);
        resulttxt = new JTextField(20);
        resulttxt.addKeyListener(this);
        add(firstlbl);
        add(secondlbl);
        add(firsttxt);
        add(secondtxt);
        add(result);
        add(resulttxt);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    public static void main(String[] args) {
        new HandlingKeyEvent();
    }
}
