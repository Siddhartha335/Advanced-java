package advanceSwingComponents;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListDemo extends JFrame {
    JList<String> list;
    JLabel area;
    public JListDemo() {
        setTitle("List Demonstration frame");
        area = new JLabel();
        String [] names = {"Jordi","Eva","Mia","Otis"};
        list = new JList<>(names);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                area.setText(list.getSelectedValuesList().toString());
            }
        });
        add(list, BorderLayout.NORTH);
        add(area,BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListDemo();
    }

}
