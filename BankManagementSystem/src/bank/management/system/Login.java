package bank.management.system ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton loignbutton,clearbutton,signupbutton;
    JTextField cardTextField;
    JPasswordField pinTextField;
    public Login(){setLayout(null);
        setTitle("AUTOMATIC TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome To The ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(170,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No :");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);

        //card field
        cardTextField = new JTextField();
        cardTextField.setBounds(290,150,250,40);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("Pin :");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,150,40);
        add(pin);

        //pin field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(290,220,250,40);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        loignbutton = new JButton("SIGN IN");
        loignbutton.setBounds(290,300,100,30);
        loignbutton.setBackground(Color.DARK_GRAY);
        loignbutton.setForeground(Color.white);
        loignbutton.addActionListener(this);
        add(loignbutton);

        clearbutton = new JButton("CLEAR");
        clearbutton.setBounds(440,300,100,30);
        clearbutton.setBackground(Color.DARK_GRAY);
        clearbutton.setForeground(Color.white);
        clearbutton.addActionListener(this);
        add(clearbutton);

        signupbutton = new JButton("SIGN UP");
        signupbutton.setBounds(300,350,230,30);
        signupbutton.setBackground(Color.DARK_GRAY);
        signupbutton.setForeground(Color.white);
        signupbutton.addActionListener(this);
        add(signupbutton);

        getContentPane().setBackground(Color.white);

        setSize(800,450);
        setVisible(true);
        setLocation(350,200);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clearbutton){
            cardTextField.setText(""); //empty
            pinTextField.setText("");
        }
        else if (ae.getSource()==loignbutton) {

        }
        else if (ae.getSource()==signupbutton){

        }
    }
    public static void main(String[] args) {
        new Login();
    }


}
