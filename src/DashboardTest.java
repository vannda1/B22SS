import javax.swing.*;
import java.awt.*;

public class DashboardTest {
    private JPanel mainPanel;

    public DashboardTest(){
        JFrame frame = new JFrame("Dashboard");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        DashboardTest dashboardTest= new DashboardTest();
    }
}
