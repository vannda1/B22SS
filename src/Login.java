import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.cert.TrustAnchor;

public class Login {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JButton clearButton;
    private void init(){
        JFrame frame=new JFrame("Login");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,400);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    public Login(){
        init();
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setBackground(new Color(12, 147, 39));
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setBackground(new Color(2,250,77));
            }
        });
    }

    public static void main(String[] args) {
        Login login= new Login();
    }
}
