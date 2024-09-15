package eventHandling;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventHandle extends JFrame implements WindowListener {
    JLabel lbl;

    public WindowEventHandle() {
        setTitle("WindowEvent Frame");
        setSize(300,300);
        lbl = new JLabel();
        add(lbl);
        setVisible(true);
        addWindowListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(lbl,"Welcome");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(lbl,"Bye Bye");
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(lbl,"See you soon");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(lbl,"Welcome back");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated!");
    }

    public static void main(String[] args) {
        new WindowEventHandle();
    }
}
