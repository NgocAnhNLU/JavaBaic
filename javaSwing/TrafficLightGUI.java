package javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightGUI extends JFrame {

    private JTextField messageField;
    private JRadioButton redButton, yellowButton, greenButton;

    public TrafficLightGUI() {

        // Set up the frame
        setTitle("Traffic Light");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the labels and radio buttons
        JLabel label = new JLabel("Chọn loại đèn:");
        redButton = new JRadioButton("Đỏ");
        yellowButton = new JRadioButton("Vàng");
        greenButton = new JRadioButton("Xanh");

        // Add the radio buttons to a button group
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Create the text fields
        messageField = new JTextField(20);
        messageField.setEditable(false);
        JTextField redTextField = new JTextField("Đỏ");
        redTextField.setEditable(false);
        JTextField yellowTextField = new JTextField("Vàng");
        yellowTextField.setEditable(false);
        JTextField greenTextField = new JTextField("Xanh");
        greenTextField.setEditable(false);

        // Create the panels
        JPanel northPanel = new JPanel(new GridLayout(4, 1));
        northPanel.add(label);
        northPanel.add(redTextField);
        northPanel.add(yellowTextField);
        northPanel.add(greenTextField);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(new JLabel("Chọn loại đèn:"), BorderLayout.WEST);
        JPanel radioButtonPanel = new JPanel();
        radioButtonPanel.add(redButton);
        radioButtonPanel.add(yellowButton);
        radioButtonPanel.add(greenButton);
        centerPanel.add(radioButtonPanel, BorderLayout.CENTER);

        // Add listeners to the radio buttons
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	redTextField.setText("Đỏ bạn chọn màu Đỏ");
            	yellowTextField.setText("Vàng:");
            	greenTextField.setText("Xanh:");
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	yellowTextField.setText("Vàng bạn chọn màu Vàng");
            	greenTextField.setText("Xanh:");
            	redTextField.setText("Đỏ:");
            }
        });

        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	greenTextField.setText("Xanh bạn chọn màu Xanh");
            	redTextField.setText("Đỏ:");
            	yellowTextField.setText("Vàng:");
            }
        });



        // Add the panels to the frame
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);


        // Pack and display the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficLightGUI();
    }

}
