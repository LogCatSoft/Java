package chat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class main_window extends JFrame{
	public main_window() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setBounds(350,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan_bottom = new JPanel();
		pan_bottom.setPreferredSize(new Dimension(500, 100));
		getContentPane().add(pan_bottom, BorderLayout.SOUTH);
		
		JPanel pan_top = new JPanel();
		pan_top.setPreferredSize(new Dimension(500, 400));
		getContentPane().add(pan_top, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main_window();
	}

}
