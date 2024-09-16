package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HandlingFocusEvent extends JFrame implements FocusListener {
    JTextField text;

    JButton btn;

    public HandlingFocusEvent() {
        text = new JTextField();
        btn = new JButton("Click");
        setTitle("Focus frame");
        setSize(200,200);
        text.addFocusListener(this);
        add(text, BorderLayout.NORTH);
        add(btn,BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Focus gained!");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("Focus lost!");
    }

    public static void main(String[] args) {
        new HandlingFocusEvent();
    }


}
