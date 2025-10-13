package sanika;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutManager extends JFrame {
    public FlowLayoutManager() {
        setTitle("FlowLayout Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutManager();
    }
}
