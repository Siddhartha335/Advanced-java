package eventHandling;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends MouseAdapter {
    JLabel lbl;
    JFrame frame;

    public MouseAdapterDemo() {
        frame = new JFrame();
        frame.setTitle("MouseEvent Frame");
        frame.setSize(300,300);
        lbl = new JLabel();
        frame.add(lbl);
        frame.addMouseListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lbl.setText("Clicked at" + " (" +  e.getX() + "," + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
