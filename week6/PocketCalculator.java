package week6;
// toi ve lam
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PocketCalculator extends JFrame implements ActionListener {

	private JTextField txtValue1, txtValue2, txtResult;
	private JButton btnAdd, btnSubtract, btnMultiply, btnDivide,btResult;

	public PocketCalculator() {
		// Set up the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);

		// Set up the components
		txtValue2 = new JTextField(20);
		txtResult = new JTextField(20);
		txtResult.setEditable(false);

		// Set up the layout
		setLayout(new GridLayout(5, 1));
		// dong 1
		JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		Label label_1 = new Label("so thu 1");
		txtValue1 = new JTextField(20);
		panel_1.add(label_1);
		panel_1.add(txtValue1);
		this.add(panel_1);
		// dong 2
		JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		this.btnAdd = new JButton("+");
		this.btnSubtract = new JButton("-");
		this.btnMultiply = new JButton("*");
		this.btnDivide = new JButton("/");
		jPanel2.add(btnAdd);
		jPanel2.add(btnSubtract);
		jPanel2.add(btnMultiply);
		jPanel2.add(btnDivide);
		this.add(jPanel2);
		// dong 3
		JPanel panel_3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		Label label_3 = new Label("so thu 2");
		txtValue2 = new JTextField(20);
		panel_3.add(label_3);
		panel_3.add(txtValue2);
		this.add(panel_3);
		//dong4
		JPanel jPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		this.btnAdd = new JButton("+");
	
		jPanel4.add(b);

		this.add(jPanel2);
		// Add action listeners to the buttons
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		// Show the window
		setVisible(true);
	}

//	public void actionPerformed(ActionEvent e) {
	// Get the values from the text fields
//		double value1 = Double.parseDouble(txtValue1.getText());
//		double value2 = Double.parseDouble(txtValue2.getText());

	// Calculate the result based on the button that was clicked
//		if (e.getSource() == btnAdd) {
//			txtResult.setText(Double.toString(value1 + value2));
//		} else if (e.getSource() == btnSubtract) {
//			txtResult.setText(Double.toString(value1 - value2));
//		} else if (e.getSource() == btnMultiply) {
//			txtResult.setText(Double.toString(value1 * value2));
//		} else if (e.getSource() == btnDivide) {
//			txtResult.setText(Double.toString(value1 / value2));
//		}
//	}

	public static void main(String[] args) {
		PocketCalculator calc = new PocketCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
