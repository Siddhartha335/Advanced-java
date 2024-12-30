package choiceComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxDemo extends JFrame {

    JComboBox<String> country;
    JLabel countrylbl,displaylbl;

    public ComboBoxDemo() {
        setTitle("Country Frame");
        setSize(502, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
//        setBounds(1000, 350, 250, 300);
        setResizable(false);
        //object creation
        displaylbl = new JLabel();
        countrylbl = new JLabel("Choose country");
        String [] countries = {"Nepal","India","China"};
        country = new JComboBox<String>(countries);
//        String [] newCountries = {"USA","Mexico","Chile"};
        country.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                displaylbl.setText(country.getSelectedItem().toString());
            }
        });
        country.addItem("Pakistan");
        country.addItem("USA");
        //adding components to JFrame
        add(countrylbl);
        add(country);
        add(displaylbl);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
