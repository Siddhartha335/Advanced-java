package choiceComponents;

import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
    JRadioButton male,female,others;
    JLabel genderlbl;
    ButtonGroup group;
    public RadioButtonDemo() {
        setTitle("Gender Frame");
//        setSize(200,200);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
        setBounds(1000,350,200,200);
        setResizable(false);
        group = new ButtonGroup();
        male = new JRadioButton("MALE");
        female = new JRadioButton("FEMALE");
        others = new JRadioButton("OTHERS");
        genderlbl = new JLabel("Choose Gender");
        group.add(male);
        group.add(female);
        group.add(others);
        add(genderlbl);
        add(male);
        add(female);
        add(others);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
