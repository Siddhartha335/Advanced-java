package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConceptOfEvent extends JFrame implements ActionListener {
    JButton btn;
    public ConceptOfEvent() {
        setTitle("Event Concept");
        btn = new JButton("Click");
        btn.addActionListener(this);
        add(btn, BorderLayout.NORTH);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ConceptOfEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
