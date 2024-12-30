package choiceComponents;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class CheckBoxDemonstration extends JFrame {
    JLabel courselbl, displaylbl;
    JCheckBox bca, csit, bbm, bbs, bit;
    JButton btn;

    public CheckBoxDemonstration() {
        setTitle("Course Frame");
        setSize(502, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
//        setBounds(1000, 350, 200, 200);
//        setResizable(false);

        // Object creation
        courselbl = new JLabel("Choose Program:");
        displaylbl = new JLabel();
        bca = new JCheckBox("BCA");
        csit = new JCheckBox("CSIT");
        bbm = new JCheckBox("BBM");
        bbs = new JCheckBox("BBS");
        bit = new JCheckBox("BIT");
        btn = new JButton("DISPLAY");

        // ActionListener to handle button click
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a list to hold selected course names
                ArrayList<String> list = new ArrayList<>();

                // Check which courses are selected and add them to the list
                if (bca.isSelected()) {
                    list.add("BCA");
                }
                if (csit.isSelected()) {
                    list.add("CSIT");
                }
                if (bbm.isSelected()) {
                    list.add("BBM");
                }
                if (bbs.isSelected()) {
                    list.add("BBS");
                }
                if (bit.isSelected()) {
                    list.add("BIT");
                }

                // Display the selected courses
                displaylbl.setText(String.join(", ", list));
            }
        });

        // Adding components to JFrame
        add(courselbl);
        add(bca);
        add(csit);
        add(bbm);
        add(bbs);
        add(bit);
        add(btn);
        add(displaylbl);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxDemonstration();
    }
}