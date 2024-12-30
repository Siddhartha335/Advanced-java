package eventHandling;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventHandle extends JFrame implements MouseListener {
    JLabel lbl;
    public MouseEventHandle() {
        setTitle("MouseEvent Frame");
        setSize(300,300);
        lbl = new JLabel();
        add(lbl);
        setVisible(true);
        addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lbl.setText("Clicked at" + "(" +  e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.exit(0);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lbl.setText("Clicked at" + "(" +  e.getX() + "," + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseEventHandle();
    }
}
