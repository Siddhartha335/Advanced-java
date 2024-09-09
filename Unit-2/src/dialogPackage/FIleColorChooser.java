package dialogPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FIleColorChooser extends JFrame {
    JButton filebtn, colorbtn;
    JPanel panel;
    Container con;
    public FIleColorChooser() {
        setTitle("File and Color Frame");
        setSize(300,300);
        con = getContentPane();
        filebtn = new JButton("Open File");
        filebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JFileChooser().showOpenDialog(panel);
            }
        });
        colorbtn = new JButton("Choose color");
        colorbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new JColorChooser().showDialog(panel,"Select color",Color.BLACK);
                panel.setBackground(c);
            }
        });
//        panel = new JPanel();
        con = new JPanel();
        add(filebtn, BorderLayout.NORTH);
        add(panel); //default center
        add(colorbtn, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FIleColorChooser();
    }
}
