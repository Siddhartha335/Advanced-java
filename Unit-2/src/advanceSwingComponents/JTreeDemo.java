package advanceSwingComponents;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame {
    JTree tree;
    public JTreeDemo() {
        setTitle("Tree Frame");
        setSize(300,300);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ROOT");
        DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("FRUITS");
        DefaultMutableTreeNode vegetable = new DefaultMutableTreeNode("VEGETABLES");
        DefaultMutableTreeNode apple = new DefaultMutableTreeNode("APPLE");
        DefaultMutableTreeNode mango = new DefaultMutableTreeNode("MANGO");
        DefaultMutableTreeNode greens = new DefaultMutableTreeNode("GREENS");
        DefaultMutableTreeNode eggplant = new DefaultMutableTreeNode("EGGPLANT");
        root.add(fruits);
        root.add(vegetable);
        fruits.add(apple);
        fruits.add(mango);
        vegetable.add(greens);
        vegetable.add(eggplant);
        tree = new JTree(root);
        add(tree);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTreeDemo();
    }
}
