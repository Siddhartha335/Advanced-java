package advanceSwingComponents;

import javax.swing.*;

public class JTableDemo extends JFrame {
    JTable table;
    JScrollPane pane;
    String[] heading = new String[]{"Name","Address","Email"};
    public JTableDemo() {
        setTitle("Table Demo");
        setSize(300,300);
        String [][] data = {
                {"Sid","Lagankhel","sid33@gmail.com"},
                {"Rista","USA","rista33@gmail.com"},
                {"Yunisha","Sydney","yunisha33@gmail.com"},
        };
        table = new JTable(data,heading);
        pane = new JScrollPane(table);
        add(pane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}
