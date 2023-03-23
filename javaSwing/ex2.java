package javaSwing;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex2 extends JFrame {
	public ex2() {
		this.setTitle("Nguyễn Hữu Ngọc Anh");
		this.setLocationRelativeTo(null);
		this.setSize(700, 700);
	botherLayout botherLayout =new botherLayout();
		this.setLayout(botherLayout);
		Button button_1 = new Button("1");
		Button button_2 =new Button("2");
		Button button_3 =new Button("3");
		Button button_4 =new Button("4");
		Button button_5 =new Button("5");
		this.add(button_1,botherLayout.NORTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void setLayout(botherLayout botherLayout) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new ex2();
	}

}
