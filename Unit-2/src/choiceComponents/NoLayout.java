package choiceComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class NoLayout extends JFrame implements KeyListener {

//    JLabel lbl,pass;
//    JTextField txt;
//
//    JComboBox<String> country;
//    JLabel countrylbl,displaylbl;//    JRadioButton m,f,o;
//    JLabel lbl;
//    ButtonGroup group;
//    JLabel courselbl,displaylbl;
//    JCheckBox csit,bca,bit,bwit;
//    JButton btn;
//    JMenuBar bar;
//    JMenu file,edit;
//    JMenuItem open,save,exit,copy,paste,icon;
//    JToolBar tbar;
//    JPanel panel;

    JTextField num1,num2,res;
    JLabel l1,l2,l3;
    JButton btn;



    public NoLayout() {
//        setTitle("No Layout");
//        setSize(400,500);
//        setDefaultLookAndFeelDecorated(true);
//        setLayout(null);
//        lbl = new JLabel("Name");
//        lbl.setBounds(20,4,50,10);
//        txt = new JTextField("Sid",15);
//        txt.setBounds(124,25,100,20);
//        add(lbl);
//        add(txt);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        setLayout(new FlowLayout(100,50,100));
//        JButton b1 = new JButton("1");
//        JButton b2 = new JButton("2");
//        JButton b3 = new JButton("3");
//        JButton b4 = new JButton("4");
//        JButton b5 = new JButton("5");
//        add(b1);//default placed at center
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        setSize(400,500);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        setLayout(new BorderLayout(5, 5));// vgap and hgap 5
//        JButton b1 = new JButton("NORTH");
//        JButton b2 = new JButton("SOUTH");
//        JButton b3 = new JButton("EAST");
//        JButton b4 = new JButton("WEST");
//        JButton b5 = new JButton("CENTER");
//        add(b1, BorderLayout.NORTH);
//        add(b2, BorderLayout.SOUTH);
//        add(b3, BorderLayout.EAST);
//        add(b4, BorderLayout.WEST);
//        add(b5, BorderLayout.CENTER);
//        setSize(300, 300);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        setLayout(new GridLayout(3, 3, 5, 5));
//        setTitle("Grid Layout");
//        setSize(300, 300);
//        JButton b1 = new JButton("1");
//        JButton b2 = new JButton("2");
//        JButton b3 = new JButton("3");
//        JButton b4 = new JButton("4");
//        JButton b5 = new JButton("5");
//        JButton b6 = new JButton("6");
//        JButton b7 = new JButton("7");
//        JButton b8 = new JButton("8");
//        JButton b9 = new JButton("9");
//        add(b1);
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);
//        add(b7);
//        add(b8);
//        add(b9);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //text components haru::
//        setTitle("Text Component Test");
//        setSize(300, 300);
//        final JTextField textField = new JTextField(10);
//        final JTextArea ta = new JTextArea(5,100);
//        JScrollPane sp = new JScrollPane(ta);
//        setLayout(new BorderLayout());
//        lbl = new JLabel("Username:");
//        pass = new JLabel("Password:");
//        add(lbl,BorderLayout.NORTH);
//        add(textField,BorderLayout.WEST);
//        add(pass,BorderLayout.EAST);
//        add(sp,BorderLayout.SOUTH);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(400,500);
//        setTitle("Country frame");
//        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
////        setResizable(false);
//        displaylbl = new JLabel("");
//        countrylbl = new JLabel("Choose a country:");
//        String[] countries = {"Nepal","India","China"};
//        country = new JComboBox<String>(countries);
//
//        country.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                displaylbl.setText(country.getSelectedItem().toString());
//            }
//        });
//
//        country.addItem("USA");
//        country.addItem("Mexico");
//        add(countrylbl);
//        add(country);
//        add(displaylbl);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setTitle("Radio");
//        setBounds(1000,350,200,200);
//        setResizable(false);
//        setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
//        group = new ButtonGroup();
//        lbl = new JLabel("Choose a gender:");
//        m = new JRadioButton("Male");
//        f = new JRadioButton("Female");
//        o = new JRadioButton("OTHERS");
//        group.add(m);
//        group.add(f);
//        group.add(o);
//        add(lbl);
//        add(m);
//        add(f);
//        add(o);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setTitle("Course Frame");
//        setSize(502, 400);
//        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
//        courselbl = new JLabel("Choose course");
//        displaylbl = new JLabel("");
//        csit = new JCheckBox("CSIT");
//        bca = new JCheckBox("BCA");
//        bit = new JCheckBox("BIT");
//        bwit = new JCheckBox("BWIT");
//        btn = new JButton("ADD");
//
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ArrayList<String> list = new ArrayList<>();
//                if(csit.isSelected()) {
//                    list.add("CSIT");
//                }
//                if (bca.isSelected()) {
//                    list.add("BCA");
//                }
//                if (bit.isSelected()) {
//                    list.add("BIT");
//                }
//                if (bwit.isSelected()) {
//                    list.add("BWIT");
//                }
//                displaylbl.setText(String.join(",",list));
//            }
//        });
//
//        add(courselbl);
//        add(bca);
//        add(csit);
//        add(bit);
//        add(bwit);
//        add(btn);
//        add(displaylbl);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        super("Menu bar");
//        setBounds(1000,350,200,200);
//        bar = new JMenuBar();
//
//        file = new JMenu("File");
//        file.setMnemonic('f');
//        edit = new JMenu("Edit");
//        edit.setMnemonic('e');
//        bar.add(file);
//        bar.add(edit);
//
//        open = new JMenuItem("OPEN");
//        open.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser fc = new JFileChooser();
//                fc.showOpenDialog(open);
//            }
//        });
//        save = new JMenuItem("SAVE");
//        exit = new JMenuItem("EXIT");
//        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
//        exit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        file.add(open);
//        file.add(save);
//        file.add(exit);
//        copy = new JMenuItem("COPY");
//        paste = new JMenuItem("PASTE");
//        icon = new JMenuItem(new ImageIcon(getClass().getResource("menu.png")));
//        edit.add(copy);
//        edit.add(paste);
//        edit.add(icon);
//
//        JCheckBoxMenuItem status = new JCheckBoxMenuItem("Status",true);
//        edit.add(status);
//        JRadioButtonMenuItem online = new JRadioButtonMenuItem("Online");
//        edit.add(online);
//
//        setJMenuBar(bar); // It attaches menu to JBar
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setTitle("Toolbar Demo");
//        setSize(300, 300);
//
//        panel = new JPanel();
//
//        Action colorAction = new AbstractAction("Color",new ImageIcon(getClass().getResource("menu.png"))) {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panel.setBackground(Color.RED);
//            }
//        };
//
//        Action openAction = new AbstractAction("Open",new ImageIcon(getClass().getResource("menu.png"))) {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new JFileChooser().showOpenDialog(panel);
//            }
//        };
//        add(panel);
//        tbar = new JToolBar();
//        tbar.add(colorAction);
//        tbar.add(openAction);
//        add(tbar,"North");
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Addition of a numbers");
        setSize(400,500);
        setLayout(new GridLayout(3,2,10,10));
        l1 = new JLabel("Num1: ");
        num1 = new JTextField(2);
        l2 = new JLabel("Num2: ");
        num2 = new JTextField(2);
        l3 = new JLabel("Press any key: ");
        res = new JTextField(2);
        res.addKeyListener(this);
        add(l1);
        add(num1);
        add(l2);
        add(num2);
        add(l3);
        add(res);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new NoLayout();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int number1 = Integer.parseInt(num1.getText());
        int number2 = Integer.parseInt(num2.getText());
        int sum = number2 + number1;
        JOptionPane.showMessageDialog(new JFrame(),"The sum is: " + sum);
        res.setText(String.valueOf(sum));
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
