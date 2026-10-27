import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerLesson {
    void main() {
        new MyFrame();
    }

    private static class MyFrame extends JFrame implements KeyListener {
        JLabel label;

        MyFrame() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500, 500);
            this.setLayout(null);
            this.addKeyListener(this);

            label = new JLabel();
            label.setBounds(0, 0, 100, 100);
            label.setBackground(Color.red);
            label.setOpaque(true);

            this.add(label);

            this.setVisible(true);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 37:
                    label.setLocation(label.getX() - 10, label.getY());
                    break;
                case 39:
                    label.setLocation(label.getX() + 10, label.getY());
                    break;
                case 38:
                    label.setLocation(label.getX(), label.getY() - 10);
                    break;
                case 40:
                    label.setLocation(label.getX(), label.getY() + 10);
                    break;
                default:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Your released keycode: " + e.getKeyCode());
        }

        @Override
        public void keyTyped(KeyEvent e) {
            switch (e.getKeyChar()) {
                case 'a':
                    label.setLocation(label.getX() - 10, label.getY());
                    break;
                case 'd':
                    label.setLocation(label.getX() + 10, label.getY());
                    break;
                case 'w':
                    label.setLocation(label.getX(), label.getY() - 10);
                    break;
                case 's':
                    label.setLocation(label.getX(), label.getY() + 10);
                    break;

                default:
                    break;
            }
        }
    }

}
