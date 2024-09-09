package advanceSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarDemo extends JFrame {
    JProgressBar bar;
    JButton progress;
    public ProgressBarDemo() {
        setTitle("Table Demo");
        setSize(300,300);
        bar = new JProgressBar(SwingConstants.HORIZONTAL,1,100);
        bar.setStringPainted(true);
        progress = new JButton("Click to show progress:");
        progress.addActionListener(new ActionListener() {
            int count =0;
            @Override
            public void actionPerformed(ActionEvent e) {
                count+=10;
                if(count>80) {
                    bar.setString("Distinction");
                }
                bar.setValue(count);
            }
        });
        add(progress, BorderLayout.NORTH);
        add(bar,BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ProgressBarDemo();
    }
}
