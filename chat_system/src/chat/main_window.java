package chat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.TextArea;

public class main_window extends JFrame{

	public main_window() {
		// TODO Auto-generated constructor stub
		
		setBounds(350,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan_bottom = new JPanel();
		pan_bottom.setPreferredSize(new Dimension(500, 100));
		getContentPane().add(pan_bottom, BorderLayout.SOUTH);
		
		TextArea textArea_bottom = new TextArea();
		textArea_bottom.setSize(500, 100);
		pan_bottom.add(textArea_bottom);
		
		
		JPanel pan_top_left = new JPanel();
		pan_top_left.setPreferredSize(new Dimension(300,300));
		getContentPane().add(pan_top_left, BorderLayout.WEST);
		
		JTextArea textArea_top = new JTextArea();
		textArea_top.setRows(20);
		textArea_top.setFont(new Font("Monospaced", Font.PLAIN, 10));
		textArea_top.setColumns(60);
		pan_top_left.add(textArea_top);
		
		
		
		
		JPanel pan_top_right = new JPanel();
		pan_top_right.setPreferredSize(new Dimension(150,400));
		getContentPane().add(pan_top_right, BorderLayout.EAST);
		

		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main_window();
	}

}
