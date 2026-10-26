import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HowToOpenNewWindow {
    void main() {
        new LaunchPage();
    }
}

class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myBtn = new JButton("New Window");

    LaunchPage() {
        myBtn.setBounds(100, 160, 200, 40);
        myBtn.setFocusable(false);
        myBtn.addActionListener(this);

        frame.add(myBtn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myBtn) {
            frame.dispose();
            new NewWindow();
        }
    }
}

class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    NewWindow() {
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
