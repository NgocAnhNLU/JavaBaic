package javaSwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        // Tạo một JFrame
        JFrame frame = new JFrame("Swing Demo");

        // Tạo một JPanel
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Vẽ hình chữ nhật
                g.setColor(Color.RED);
                g.fillRect(10, 10, 100, 50);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(300, 100);
            }
        };

        // Tạo một JColorChooser
        JColorChooser colorChooser = new JColorChooser(Color.RED);

        // Tạo một JCheckBox
        JCheckBox checkBox = new JCheckBox("Fill Rectangle", true);

        // Đăng ký bộ lắng nghe sự kiện cho JCheckBox
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
            }
        });

        // Tạo một JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Small", true);
        JRadioButton radioButton2 = new JRadioButton("Medium");
        JRadioButton radioButton3 = new JRadioButton("Large");

        // Tạo một JList
        String[] fruits = {"Apple", "Banana", "Cherry", "Grape", "Orange"};
        JList<String> list = new JList<>(fruits);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Tạo một JComboBox
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Pink"};
        JComboBox<String> comboBox = new JComboBox<>(colors);

        // Tạo một ImageIcon
        ImageIcon icon = new ImageIcon("image.png");

        // Tạo một JScrollBar
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10, 0, 100);

        // Thêm các phần tử vào JPanel
        panel.add(colorChooser);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(list);
        panel.add(comboBox);
        panel.add(new JLabel(icon));
        panel.add(scrollBar);

        // Thêm JPanel vào JFrame và cấu hình các thuộc tính JFrame
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
