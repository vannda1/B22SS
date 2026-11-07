import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class TestGridLayout {
    public static void main(String[] args) {
        JFrame frame= new JFrame("test gridlayout");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton btn[]= new JButton[10];
        for (int i=0;i<btn.length;i++){
            btn[i]=new JButton("button "+i);
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,"btn click");
                }
            });
            frame.add(btn[i]);
        }
        frame.setLayout(new GridLayout(10,1));
        frame.setVisible(true);
    }
}
