import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class TwoDGraphics {
    void main() {
        MyFrame frame = new MyFrame();
        frame.paint(frame.getGraphics());

    }

    private static class MyFrame extends JFrame {
        MyPanel panel;

        MyFrame() {
            panel = new MyPanel();

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500, 500);

            this.add(panel);
            this.pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }

    }

    private static class MyPanel extends JPanel {
        MyPanel() {
            this.setPreferredSize(new Dimension(500, 500));
        }

        public void paint(Graphics g) {
            Graphics2D g2D = (Graphics2D) g;

            g2D.setPaint(Color.blue);
            g2D.setStroke(new BasicStroke(5));
            // g2D.drawLine(0, 0, 500, 500);

            g2D.setPaint(Color.pink);
            // g2D.drawRect(0, 0, 100, 200);

            // g2D.fillRect(0, 0, 100, 200);

            // g2D.drawOval(0, 0, 100, 100);

            // g2D.setPaint(Color.red);
            // g2D.fillArc(0, 0, 100, 100, 0, 180);
            // g2D.setPaint(Color.white);
            // g2D.fillArc(0, 0, 100, 100, 180, 180);

            // int[] xPoints = { 150, 250, 350 };
            // int[] yPoints = { 300, 150, 300 };
            // g2D.fillPolygon(xPoints, yPoints, 3);

            g2D.drawString("U R A Winner!", 50, 50);
        }
    }

}
