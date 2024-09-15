package eventHandling;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterDemo extends WindowAdapter {
    JLabel lbl;
    JFrame frame;

    public WindowAdapterDemo() {
        frame = new JFrame();
        frame.setTitle("WindowEvent Frame");
        frame.setSize(300,300);
        lbl = new JLabel();
        frame.add(lbl);
        frame.setVisible(true);
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(lbl,"Welcome");
    }


    public static void main(String[] args) {
        new WindowAdapterDemo();
    }
}
