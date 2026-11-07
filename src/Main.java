import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        JButton button[]=new JButton[101];
        for(int i=0;i<button.length;i++){
            button[i]=new JButton("button"+i);
            frame.add(button[i]);
        }
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,30,20));
        frame.setVisible(true);
    }
}