package choiceComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener {
    JLabel lbl, dis;
    JTextField txt;
    JButton pal,reverse,vowels;

    public GUI() {
        setTitle("GUI");
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        lbl = new JLabel("Input any string:");
        dis = new JLabel("");
        txt = new JTextField(2);
        pal = new JButton("Check Palindrome");
        pal.addActionListener(this);
        reverse = new JButton("Reverse a string");
        reverse.addActionListener(this);
        vowels = new JButton("Extract a vowel");
        vowels.addActionListener(this);
        add(lbl);
        add(txt);
        add(pal);
        add(reverse);
        add(vowels);
        add(dis);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pal) {
            String str = txt.getText();
            int l = 0;
            int r = str.length() -1;
            while(l<r) {
                if(str.charAt(l) != str.charAt(r)) {
                    dis.setText("It is a palindrome!");
                }
                l++;
                r--;
            }
            dis.setText("It is not a palindrome!");

        }

        if(e.getSource() == reverse) {
            String str = txt.getText();
            String rev = new StringBuilder(str).reverse().toString();
            dis.setText(rev);
        }

        if(e.getSource() == vowels) {
            String str = txt.getText();
            ArrayList<Character> list = new ArrayList<Character>();
           for(int i=0;i<str.length();i++) {
               char ch = str.charAt(i);
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                   list.add(ch);
               }
            }
           dis.setText(String.valueOf(list));
        }
    }
}
