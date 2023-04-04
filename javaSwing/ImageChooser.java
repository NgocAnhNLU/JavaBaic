package javaSwing;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageChooser extends JFrame {

    private JComboBox<String> pictureComboBox;
    private JPanel imagePanel;
    private ImageIcon image1, image2, image3;

    public ImageChooser() {
        setTitle("Image Chooser");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize the images
        image1 = new ImageIcon("1.jpg");
        image2 = new ImageIcon("2.jpg");
        image3 = new ImageIcon("3.jpg");

        // Create the JComboBox and add the images to it
        pictureComboBox = new JComboBox<>();
        pictureComboBox.addItem("hinh1");
        pictureComboBox.addItem("hinh2");
        pictureComboBox.addItem("hinh3");

        // Create the JPanel to display the image
        imagePanel = new JPanel();
        add(pictureComboBox, BorderLayout.NORTH);
        add(imagePanel, BorderLayout.CENTER);

        // Set the default image to display
        imagePanel.add(new ImageIcon(image1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));

        // Add an action listener to the JComboBox to change the image displayed
        pictureComboBox.addActionListener(e -> {
            if (pictureComboBox.getSelectedItem().equals("hinh1")) {
                imagePanel.removeAll();
                imagePanel.add(temporaryLostComponent, new ImageIcon(image1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
                imagePanel.revalidate();
                imagePanel.repaint();
            } else if (pictureComboBox.getSelectedItem().equals("hinh2")) {
                imagePanel.removeAll();
                imagePanel.add(new ImageIcon(image2.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
                imagePanel.revalidate();
                imagePanel.repaint();
            } else if (pictureComboBox.getSelectedItem().equals("hinh3")) {
                imagePanel.removeAll();
                imagePanel.add(new ImageIcon(image3.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
                imagePanel.revalidate();
                imagePanel.repaint();
            }
        });
    }

    public static void main(String[] args) {
        ImageChooser imageChooser = new ImageChooser();
        imageChooser.setVisible(true);
    }
}
