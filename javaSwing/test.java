//package javaSwing;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class test extends JFrame {
//	public void TestPanel() {
//		JPanel p1 = new JPanel();
//		p1.setLayout(new GridLayout(4, 3));
//		for (int i = 1; i <= 9; i++) {
//		    p1.add(new JButton(" " + i));
//		}
//
//		p1.add(new JButton("0"));
//		p1.add(new JButton("Start"));
//		p1.add(new JButton("Stop"));
//
//		JPanel p2 = new JPanel(new BorderLayout());
//		p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
//		add(p2, BorderLayout.WEST);
//		add(new JButton("Food to be placed here"), BorderLayout.CENTER);
//	}
//	public static void main(String[] args) {
//		TestPanel frame = new TestPanel;
//		frame.setTitle("The font view of a Microwave Oven");
//		frame.setSize(400, 250);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		frame.setVisible(true);
//	}
//}
package javaSwing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame {

    public test() {
        TestPanel();
    }

    public void TestPanel() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton(" " + i));
        }

        p1.add(new JButton("0"));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        test frame = new test();
        frame.setTitle("The font view of a Microwave Oven");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

