package choiceComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemonstration extends JFrame {
    JMenuBar bar;
    JMenu file,edit;
    JMenuItem open,save,exit,copy,paste;
    JCheckBoxMenuItem status;
    JRadioButtonMenuItem online;
    public MenuDemonstration() {
        super("Menu frame");
        setBounds(1000,350,250,200);
        bar = new JMenuBar();
        //Menu
        file = new JMenu("FILE");
        file.setMnemonic('F'); //opt+f
        edit = new JMenu("EDIT");
        edit.setMnemonic('E');
        bar.add(file);
        bar.add(edit);
        //MenuItems
        open = new JMenuItem("OPEN");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(open);
            }
        });
        save = new JMenuItem("SAVE");
        exit = new JMenuItem("EXIT");
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(open);
        file.add(save);
        file.add(exit);
        copy = new JMenuItem("COPY");
        paste = new JMenuItem("PASTE");
        edit.add(copy);
        edit.add(paste);
        //check menuitem
        status = new JCheckBoxMenuItem("Status",true);//checked
        edit.add(status);
        //Radio MenuItem
        online = new JRadioButtonMenuItem("Online");
        edit.add(online);
        setJMenuBar(bar); //It attaches menu to the Jbar

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuDemonstration();
    }
}
