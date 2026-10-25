import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonLesson {
    void main() {
        new MyFrame();
    }
}

/**
 * MyFrame
 */
class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {
        this.button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
            System.out.println("poo");
        }
    }
}