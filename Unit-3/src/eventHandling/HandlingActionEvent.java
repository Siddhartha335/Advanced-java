package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlingActionEvent extends JFrame implements ActionListener {
    JLabel firstlbl,secondlbl,result;
    JTextField firsttxt,secondtxt,resulttxt;
    JButton add,subtract;
    public HandlingActionEvent() {
        setTitle("ActionEvent Frame");
        setSize(500,400);
        setLayout(new GridLayout(4,2,5,5));
        firstlbl = new JLabel("First num");
        secondlbl = new JLabel("Second num");
        result = new JLabel("Result");
        firsttxt = new JTextField(20);
        secondtxt = new JTextField(20);
        resulttxt = new JTextField(20);
        add = new JButton("Add");
        add.setActionCommand("+");
        add.addActionListener(this);
        subtract = new JButton("Subtract");
        subtract.setActionCommand("-");
        subtract.addActionListener(this);
        add(firstlbl);
        add(secondlbl);
        add(firsttxt);
        add(secondtxt);
        add(result);
        add(resulttxt);
        add(add);
        add(subtract);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a,b,c=0;
        a = Integer.parseInt(firsttxt.getText());
        b = Integer.parseInt(secondtxt.getText());
        if(e.getActionCommand() == "+") {
            c = a+b;
        } else {
            c = Math.abs(a-b);
        }
        resulttxt.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new HandlingActionEvent();
    }
}
