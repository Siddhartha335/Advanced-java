package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HandlingActionEvent extends MouseAdapter {
    JLabel firstlbl,secondlbl;
    JTextField firsttxt,secondtxt;
    JFrame frame;
    public HandlingActionEvent() {
        frame = new JFrame();
        frame.setTitle("MouseEvent Frame");
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(2,2,5,5));
        firstlbl = new JLabel("First num");
        secondlbl = new JLabel("Second num");
        firsttxt = new JTextField(20);
        secondtxt = new JTextField(20);
        frame.add(firstlbl);
        frame.add(firsttxt);
        frame.add(secondlbl);
        frame.add(secondtxt);
        frame.addMouseListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(firsttxt.getText());
        int num2 = Integer.parseInt(secondtxt.getText());
        int c = num1+num2;
        JOptionPane.showMessageDialog(new JFrame(),c);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(firsttxt.getText());
        int num2 = Integer.parseInt(secondtxt.getText());
        int c = Math.abs(num1-num2);
        JOptionPane.showMessageDialog(new JFrame(),c);
    }

    public static void main(String[] args) {
        new HandlingActionEvent();
    }
}
