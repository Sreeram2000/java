import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaClass implements ActionListener{

    JFrame frame;
    JButton[] button = new JButton[10];
    JPanel panel;
    JTextField textfield;

    JavaClass()
    {
        frame = new JFrame("Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
        frame.setVisible(true);
        textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		// textfield.setFont(myFont);
		textfield.setEditable(false);
        //to do add panel
        panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));

    }

    public static void main(String args[]) {
        // System.out.println("javaProgram");
        JavaClass project = new JavaClass();
    }

    public void actionPerformed(ActionEvent e)
    {

    }
}
