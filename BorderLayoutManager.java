package JAVA;

import java.awt.*;
import javax.swing.*;
public class BorderLayoutManager extends JFrame{
	public BorderLayoutManager() {
		setTitle("Border Layout");
		setSize(400,300);
		setLayout(new BorderLayout());
		
		add(new JButton("North"),BorderLayout.NORTH);
		add(new JButton("South"),BorderLayout.SOUTH);
		add(new JButton("East"),BorderLayout.EAST);
		add(new JButton("West"),BorderLayout.WEST);
		add(new JButton("Center"),BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutManager();
	}
}