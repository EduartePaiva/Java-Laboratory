import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class labelsAndFrame {
    void main() {

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        ImageIcon image = new ImageIcon("dunn_icon.png");

        JLabel label = new JLabel();
        label.setText("Bro, do you even coode?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0, 0, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }

}
