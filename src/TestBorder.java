import javax.swing.*;
import java.awt.*;

public class TestBorder {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Border layout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        JButton btn1= new JButton("North");
        JButton btn2=new JButton("South");
        JButton btn3= new JButton("East");
        JButton btn4=new JButton("West");
        JButton btn5= new JButton("Center");
        frame.setLayout(new BorderLayout());
        frame.add(btn1,BorderLayout.NORTH);
        frame.add(btn2,BorderLayout.SOUTH);
        frame.add(btn3,BorderLayout.EAST);
        frame.add(btn4,BorderLayout.WEST);
        frame.add(btn5,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
