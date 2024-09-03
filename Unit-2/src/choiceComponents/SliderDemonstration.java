package choiceComponents;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class SliderDemonstration extends JFrame {
    JSlider slider;
    JTextField valuetxt;

    public SliderDemonstration() {
        setTitle("Slider Frame");
        setBounds(1000,350,250,300);
        setLayout(new BorderLayout(10,10));
        ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                valuetxt.setText(String.valueOf(source.getValue()));
            }
        };
        slider = new JSlider(SwingConstants.HORIZONTAL,10,120,60);
        Dictionary<Integer,Component> tbl = new Hashtable<Integer,Component>();
        tbl.put(0,new JLabel("A"));
        tbl.put(20,new JLabel("B"));
        tbl.put(40,new JLabel("C"));
        tbl.put(60,new JLabel("D"));
        tbl.put(80,new JLabel("E"));
        tbl.put(100,new JLabel("F"));
        tbl.put(120,new JLabel("G"));
        slider.setLabelTable(tbl);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.addChangeListener(listener);
        add(slider,BorderLayout.NORTH);
        valuetxt = new JTextField(20);
        add(valuetxt,BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SliderDemonstration();
    }
}
