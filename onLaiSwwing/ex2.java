package onLaiSwwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ex2 extends JFrame{
	public  ex2() {}
		JFrame frame =new JFrame();
		 setSize(900,600);
		setLayout(new BorderLayout());
		String[] values = {"nn", "MM", "NM"};
        JComboBox<String> comboBox = new JComboBox<>(values);
		add(comboBox,BorderLayout.NORTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
		  public static void main(String[] args) {
//		        JFrame frame = new JFrame("Checkbox Example");
//		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		        JCheckBox checkBox1 = new JCheckBox("Option 1");
//		        JCheckBox checkBox2 = new JCheckBox("Option 2");
//		        JCheckBox checkBox3 = new JCheckBox("Option 3");
//
//		        frame.add(checkBox1);
//		        frame.add(checkBox2);
//		        frame.add(checkBox3);
//		        frame.pack();
//		        frame.setVisible(true);
//		        frame.setLayout(new FlowLayout());
//		        frame.setSize(600,100);
//		        frame.setLocationRelativeTo(null);
//		    }
			  // Hiển thị một hộp thoại thông báo đơn giản
//		        JOptionPane.showMessageDialog(null, "Xin chào!");
//
//		        // Hiển thị một hộp thoại yêu cầu người dùng nhập dữ liệu
//		        String name = JOptionPane.showInputDialog("Nhập tên của bạn:");
//
//		        // Hiển thị một hộp thoại xác nhận và lấy giá trị người dùng chọn
//		        int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
//
//		        if (choice == JOptionPane.YES_OPTION) {
//		            System.out.println("Bạn đã chọn tiếp tục.");
//		        } else {
//		            System.out.println("Bạn đã chọn dừng lại.");
//		        }
		    }
		}
	


