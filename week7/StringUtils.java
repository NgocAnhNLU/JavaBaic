package week7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StringUtils extends JFrame implements ActionListener {
	private JTextArea inputTextArea, resultTextArea;
	private JLabel inputJLabel, outputJLabel;

	public StringUtils() {
		// thiet lam cua so
		setSize(800, 500);
		setLayout(new BorderLayout());
		setTitle("Pha");

		// cac thanh phan Jframe
		// man hinh
		inputJLabel = new JLabel("chuoi nhao vao:");
		outputJLabel = new JLabel("ket qua:");
		inputTextArea = new JTextArea();
		resultTextArea = new JTextArea();
		resultTextArea.setEditable(false);
		// nut
		JButton button1 = new JButton("đảo ngược chuỗi");
		JButton button2 = new JButton("chuỗi đối xứng");
		JButton button3 = new JButton("đếm nguyên ân phụ âm");
		JButton button4 = new JButton("từ nhiều chữ nhất");
		JButton button5 = new JButton("Chuỗi đảo ngược");
		JButton button6 = new JButton("Xoá khoảng trắng");
		JButton button7 = new JButton("Ký tự nhiều thứ 2");
		JButton button8 = new JButton("bỏ ký tự đầu và cuối");
		JButton button9 = new JButton("chỉ chứa các số");
		JButton button10 = new JButton("Số nguyên âm");
		JButton button11 = new JButton("đảo ngược chuỗi11");
		JButton button12 = new JButton("chuỗi đảo ngược");
		JButton button13 = new JButton("2 chuỗi có là chuỗi đảo ngược");
		JButton button14 = new JButton("xoá khoảng trắng");
		JButton button15 = new JButton("viết hoa chữ cái đầu");
		JButton button16 = new JButton("có phải đối xứng");
		JButton button17 = new JButton("Chuỗi con");
		JButton button18 = new JButton("in ký tự");
		JButton button19 = new JButton("nối chuỗi");
		JButton button20 = new JButton("bỏ ký tự đặc biệt");
		// them su kien
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button10.addActionListener(this);
		// add cac thanh phan vao Jpanel
		// phan man hinh
		JPanel streeeJPanel = new JPanel(new GridLayout(2, 2, 10, 10));
		streeeJPanel.add(inputJLabel);
		streeeJPanel.add(inputTextArea);
		streeeJPanel.add(outputJLabel);
		streeeJPanel.add(resultTextArea);
		// add phaan nut
		JPanel jButtoPanel = new JPanel(new GridLayout(10, 2));
		jButtoPanel.add(button1);
		jButtoPanel.add(button2);
		jButtoPanel.add(button3);
		jButtoPanel.add(button4);
		jButtoPanel.add(button5);
		jButtoPanel.add(button6);
		jButtoPanel.add(button7);
		jButtoPanel.add(button8);
		jButtoPanel.add(button9);
		jButtoPanel.add(button10);
		jButtoPanel.add(button11);
		jButtoPanel.add(button12);
		jButtoPanel.add(button13);
		jButtoPanel.add(button14);
		jButtoPanel.add(button15);
		jButtoPanel.add(button16);
		jButtoPanel.add(button17);
		jButtoPanel.add(button18);
		jButtoPanel.add(button19);
		jButtoPanel.add(button20);
		// setlayout
		add(streeeJPanel);
		add(jButtoPanel);
		// add cac thanh phan
		add(streeeJPanel, BorderLayout.NORTH);
		add(jButtoPanel, BorderLayout.CENTER);
		// hien thi Jframr
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String inputStr, inputStr1, reversedStr;
		switch (e.getActionCommand()) {
			case "đảo ngược chuỗi":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex1.reverseString(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi sau khi dao nguoc");
				}
				break;
			case "chuỗi đối xứng":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();
				} else {
					if (Ex2.PalindromeString(inputStr)) {
						outputJLabel.setText("ket qua:");
						resultTextArea.setText("la chuoi doi xung");
					} else {
						resultTextArea.setText("khong la chuoi doi xung");

					}
				}

				break;
			case "đếm nguyên ân phụ âm":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					int[] count;
					count = Ex3.vowelsAndConsonants(inputStr);
					reversedStr = "số nguyên âm là " + count[0] + " số phụ âm là " + count[1];
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("Chuoi co so nguyen an, phu am:");
				}
				break;
			case "từ nhiều chữ nhất":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = ex4.LargestWord(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("tu dai nhan la");
				}

				break;
			case "Chuỗi đảo ngược":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex5.isSnagramsString(inputStr) ? "la chuoi dao nguoc cua nhau"
							: "khong la chuoi dao nguoc cua nhau";
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua:");
				}

				break;
			case "Xoá khoảng trắng":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex6.removeChar(inputStr, ' ');
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi sau khi xoa het khoang trang");
				}
				break;
			case "Ký tự nhiều thứ 2":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = String.valueOf(Ex7.findSecondMostFrequentCharacter(inputStr));
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ky tu xuat hien nhieu nhat la:");
				}

				break;
			case "bỏ ký tự đầu và cuối":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex8.removeFristAndEndString(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi sau khi bo ky tu dau va cuoi la");
				}
				break;
			case "chỉ chứa các số":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = String.valueOf(Ex9.numberOfWords(inputStr));
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi co so tu la:");
				}

				break;
			case "Số nguyên âm":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					int[] count;
					count = Ex3.vowelsAndConsonants(inputStr);
					reversedStr = "số nguyên âm là " + count[0] + " số phụ âm là " + count[1];
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("Chuoi co so nguyen an, phu am:");
				}
				break;
			case "đảo ngược chuỗi11":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex1.reverseString(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi sau khi dao nguowc ka");
				}

				break;
			case "chuỗi đảo ngược":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex13.checkPalindromeString(inputStr) ? "la chuoi dao nguoc"
							: "khong la chuoi dao nguoc";
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua:");
				}
				break;
			case "2 chuỗi có là chuỗi đảo ngược":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex13.checkPalindromeString(inputStr) ? "la chuoi dao nguoc"
							: "khong la chuoi dao nguoc";
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua:");
				}

				break;
			case "xoá khoảng trắng":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex14.removeChar(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi sau khi xoa het khoang trang");
				}

				break;
			case "viết hoa chữ cái đầu":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex15.upperString(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("chuoi viet hoa chu cai dau:");
				}

				break;
			case "có phải đối xứng":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex16.isPalindrome(inputStr) ? "la chuoi doi xung" : "khong ka chuoi doi xung";
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua:");
				}

				break;
			case "Chuỗi con":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = String.join(Ex17.getAllSubstrings(inputStr), ",");
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua cac tap hop con la:");
				}

				break;
			case "in ký tự":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = String.join(",", inputStr.split(""));
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua:");
				}

				break;
			case "nối chuỗi":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex19.joinStrings(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua noi choi:");
				}

				break;
			case "bỏ ký tự đặc biệt":
				inputStr = inputTextArea.getText();
				if (inputStr.isEmpty()) {
					notificationEmtryInput();

				} else {
					reversedStr = Ex20.removeSpecialChars(inputStr);
					resultTextArea.setText(reversedStr);
					outputJLabel.setText("ket qua sau khi bo ky tu dac biet:");
				}

				break;

		}

	}

	public void notificationEmtryInput() {
		outputJLabel.setText("Thong bao:");
		resultTextArea.setText("ban chua chap chuoi!");
	}

	public static void main(String[] args) {
		new StringUtils();
	}

}
