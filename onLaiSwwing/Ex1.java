package onLaiSwwing;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ex1  extends JFrame{
	public Ex1() {
		JFrame frame = new JFrame("on lai bai");
		setSize(900, 500);
		//laubel
		JTable table =new JTable();
		JPanel dataPanel =new JPanel();
		JPanel colorPanel =new JPanel();
		JPanel namePanel =new JPanel();
		JPanel agePanel =new JPanel();
		JPanel colorPanel1 =new JPanel();
		//setlayout
		setLayout(new GridLayout(2,1));
		dataPanel.setLayout(new GridLayout(1,3));
		colorPanel1.setLayout(new GridLayout(2,3));
		namePanel.setLayout(new GridLayout(4,1));
		agePanel.setLayout(new GridLayout(2,3));
		//new	
		JLabel coroLabel =new JLabel("mau sac");
		JLabel loaiHInhLabel =new JLabel("Loai hinh");
		JLabel fullNamLabel=new JLabel("HoVaTen");
		JLabel schooLabel=new JLabel("ten truong");
		JLabel sexLabel=new JLabel("gioi tinh");
		JLabel ageLabel=new JLabel("Do Tuoi");
		//buitton
		JRadioButton blueRadioButton =new JRadioButton("Xanh");
		JRadioButton yelloRadioButton=new JRadioButton("Vang");
		
		ButtonGroup colorButtonGroup =new ButtonGroup();
		colorButtonGroup.add(yelloRadioButton);
		colorButtonGroup.add(blueRadioButton);
		
		JRadioButton cricelRadioButton=new JRadioButton("Tron");
		JRadioButton squatRadioButton=new JRadioButton("Vuong");
		
		ButtonGroup loaiHinhButtonGroup =new ButtonGroup();
		
		
		JRadioButton maleRadioButton=new JRadioButton("nam");
		JRadioButton female=new JRadioButton("nu");
		ButtonGroup sexButtonGroup =new ButtonGroup();
		JRadioButton youghRadioButton=new JRadioButton("6->12");
		JRadioButton oldButtonRadioButton=new JRadioButton("12->18");
		ButtonGroup ageButtonGroup =new ButtonGroup();
		// text
		JTextField fullNameTextField=new JTextField();
		JTextField schoolTextField=new JTextField();
		// add laubel
		colorPanel1.add(coroLabel);
		colorPanel1.add(blueRadioButton);
		colorPanel1.add(yelloRadioButton);
		colorPanel1.add(loaiHInhLabel);
		colorPanel1.add(cricelRadioButton);
		colorPanel1.add(squatRadioButton);
		
		namePanel.add(fullNamLabel);
		namePanel.add(fullNameTextField);
		namePanel.add(schooLabel);
		namePanel.add(schoolTextField);
		
		agePanel.add(sexLabel);
		agePanel.add(maleRadioButton);
		agePanel.add(female);
		agePanel.add(ageLabel);
		agePanel.add(youghRadioButton);
		agePanel.add(oldButtonRadioButton);
		
		dataPanel.add(colorPanel1);
		dataPanel.add(namePanel);
		dataPanel.add(agePanel);
		
		add(table);
		add(dataPanel);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex1();
	}

}
