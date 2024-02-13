package bank.management.system ;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    public Login(){setLayout(null);
        setTitle("AUTOMATIC TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        setSize(800,450);
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String[] args) {
        new Login();
    }
}