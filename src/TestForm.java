import javax.swing.*;
import java.awt.*;

public class TestForm {
    private JLabel lblTitle;
    private JButton button1;
    private JPanel mainPanel;
    public TestForm(){
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        TestForm form= new TestForm();
    }
}
