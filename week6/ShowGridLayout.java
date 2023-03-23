package week6;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;


	public class ShowGridLayout extends JFrame {
	    public ShowGridLayout(String title) {
	        super(title);
	        setLayout(new GridLayout(3, 2, 5, 5));

	        add(new JLabel("First Name"));
	        add(new JTextField(8));
	        add(new JLabel("MI"));
	        add(new JTextField(1));
	        add(new JLabel("Last Name"));
	        add(new JTextField(8));

	        setSize(900, 600);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        ShowGridLayout frame = new ShowGridLayout("Grid Layout Demo");
	    }
	}


