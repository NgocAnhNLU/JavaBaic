package javaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserInfoGUI extends JFrame {

    private JTextField nameField;
    private JTextField moneyField;
    private JTextField nameShowField;
    private JTextField sexShowField;
    private JTextField moneyShowField;
    private ButtonGroup sexButtonsGroup;

    public UserInfoGUI() {
        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Demo Grid Layout");
        setSize(400, 200);

        // Create the components
        JLabel nameLabel = new JLabel("Họ và tên");
        JLabel sexLabel = new JLabel("Giới Tính");
        JLabel moneyLabel = new JLabel("số tiền");

        nameField = new JTextField(20);
        sexButtonsGroup = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton("Nam");
        JRadioButton femaleButton = new JRadioButton("Nữ");
        sexButtonsGroup.add(maleButton);
        sexButtonsGroup.add(femaleButton);
        moneyField = new JTextField(20);

        nameShowField = new JTextField(20);
        nameShowField.setEditable(false);
        sexShowField = new JTextField(20);
        sexShowField.setEditable(false);
        moneyShowField = new JTextField(20);
        moneyShowField.setEditable(false);
        //sex layout
        JPanel sexJPanel =new JPanel();
        sexJPanel.add(maleButton);
        sexJPanel.add(femaleButton);

        // Add the components to the frame
        setLayout(new GridLayout(3, 3));
        add(nameLabel);
        add(nameField);
        add(nameShowField);
        add(sexLabel);
        add(sexJPanel);
        add(sexShowField);
        add(moneyLabel);
        add(moneyField);
        add(moneyShowField);

        // Add mouse listener to update text fields
        nameField.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent event) {
                nameShowField.setText(nameField.getText());
            }
        });

        maleButton.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent event) {
                sexShowField.setText("Nam");
            }
        });

        femaleButton.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent event) {
                sexShowField.setText("Nữ");
            }
        });

        moneyField.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent event) {
                String result = String.format("%,.2f", Double.parseDouble(moneyField.getText()));
                moneyShowField.setText(result);
            }
        });

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserInfoGUI();
    }
}

