import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
		JFrame frame = new JFrame();

		JButton b1 = new JButton("B 1");
		JButton b2 = new JButton("B 2");
		JButton b3 = new JButton("B 3");
		JButton b4 = new JButton("B 4");
		JButton b5 = new JButton("B 5");
		JButton b6 = new JButton("B 6");
		JButton b7 = new JButton("B 7");

		JPanel panel = new JPanel(new GridLayout(5,5));
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);

		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
    }
}
