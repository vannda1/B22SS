import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginTest {
    private JPanel main;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton clearButton;

    private void init(){
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100,50,400,600);
        frame.add(main);
        frame.setVisible(true);
    }
    public LoginTest(){
        init();
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                loginButton.setBackground(new Color(6, 138, 35));
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setBackground(new Color(27,250,48));
            }
        });
        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                clearButton.setBackground(new Color(128, 1, 1));
            }
        });
        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                clearButton.setBackground(new Color(250,0,33));
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DashboardTest dashboardTest= new DashboardTest();
            }
        });
    }

    public static void main(String[] args) {
        LoginTest loginTest= new LoginTest();
    }
}
