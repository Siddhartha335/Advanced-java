package choiceComponents;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class ToolBarDemo extends JFrame {
    JToolBar tbar;
    JPanel panel;

    public ToolBarDemo() {
        setTitle("Toolbar Demo");
        setSize(300, 300);

        panel = new JPanel();


        Action colorAction = new AbstractAction("Color", new ImageIcon(getClass().getResource("menu.PNG"))) {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        };

        Action openAction = new AbstractAction("Open", new ImageIcon(getClass().getResource("menu.PNG"))) {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JFileChooser().showOpenDialog(panel);
            }
        };
        add(panel);
        tbar = new JToolBar();
        tbar.add(colorAction);
        tbar.add(openAction);
        add(tbar, "North");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ToolBarDemo();
    }
}

