package componentOrganizer;

import javax.swing.*;
import java.awt.*;

public class DesktopPaneDemo extends JFrame {
    JDesktopPane dp;
    JInternalFrame f1,f2,f3,f4;
    JButton b1,b2,b3,b4;

    public DesktopPaneDemo() {
        dp = new JDesktopPane();
        setTitle("Multitasking Frame");
        setSize(800,600);

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");

        //Frame one
        f1 = new JInternalFrame("Frame one",true,true,true,true);
        f1.setSize(300,300);
        f1.setLocation(10,10); //JFrame Location
        f1.setLayout(new FlowLayout());
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
        dp.add(f1);

        //Frame two
        f2 = new JInternalFrame("Frame two",true,true,true,true);
        f2.setSize(300,300);
        f2.setLocation(310,310); //JFrame Location
        f2.setLayout(new FlowLayout());
        f2.add(b3);
        f2.add(b4);
        f2.setVisible(true);
        dp.add(f2);

        add(dp);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DesktopPaneDemo();
    }
}
