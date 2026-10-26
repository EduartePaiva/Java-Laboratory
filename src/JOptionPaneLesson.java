import javax.swing.JOptionPane;

public class JOptionPaneLesson {
    // JOptionPane = pop up a standard dialog box that prompts users for a value
    // or informs them of something.
    void main() {

        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "bro?", "title", JOptionPane.YES_NO_CANCEL_OPTION);

        JOptionPane.showInputDialog("What is your name?: ");

        JOptionPane.showOptionDialog(null, "you are awesome", "secret message", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, null, 0);
    }
}
