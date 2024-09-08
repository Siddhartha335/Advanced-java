package dialogPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyInfo extends JDialog {
    JLabel infolbl;
    public MyInfo() {
        setTitle("My info:");
        infolbl = new JLabel("<html>My name is <h2>Siddhartha</h2></html>");
        add(infolbl);
        setSize(200,200);
        setVisible(true);
    }
}

public class JDialogDemo extends JFrame{
    JButton btn;

    public JDialogDemo() {
        setTitle("Dialog parent form");
        btn = new JButton("Show Info");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyInfo();
            }
        });
        setSize(400,400);
        setVisible(true);
        add(btn, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new JDialogDemo();
    }
}
