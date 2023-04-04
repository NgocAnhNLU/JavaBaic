package javaSwing;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex1 extends JFrame{
	public  Ex1 () {
		
		
	}
	public void showIt(String titel) {
		this.setTitle(titel);
		this.setLocation(600,400);
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Ex1 m1 =new Ex1();
		m1.showIt("bai 1");
	}
		
	}


