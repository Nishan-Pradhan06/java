
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class TestFrameExample {
    void TextExample() {
        System.out.println("learning the swing in java");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jframe Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("This is a label");
        JButton button = new JButton();
        button.setText("Press me");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        TestFrameExample myclass = new TestFrameExample();
        myclass.TextExample();
    }
}
