package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stock_detail implements ActionListener {
    JButton s1,s2,s3,s4;
    JTextArea about;
    public JFrame frame = new JFrame();
    public JLabel label = new JLabel("STOCK DETAILS");

    public stock_detail() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        label.setBounds(150, 0, 270, 70);
        label.setFont(new Font("Verdana", Font.BOLD, 25));
        label.setForeground(Color.cyan);

        //buttons
        s1 = new JButton();
        s1.setBounds(20, 230, 500, 70);
        s1.setText("  Nifty 50           -1.04%");
        s1.setFocusable(false);
        s1.setFont(new Font("Comic Sans", Font.BOLD, 25));
        s1.setForeground(Color.black);
        s1.setBackground(Color.lightGray);
        s1.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon nifty = new ImageIcon("Assets/Icons/nifty50.png");
        s1.setIcon(nifty);
        s1.setHorizontalTextPosition(JButton.RIGHT);
        s3 = new JButton();
        s3.setBounds(20, 390, 500, 70);
        s1.addActionListener( this);
        s3.setText("          Suzuki                +1.14%");
        s3.setFocusable(false);
        s3.setFont(new Font("Comic Sans", Font.BOLD, 25));
        s3.setForeground(Color.black);
        s3.setBackground(Color.lightGray);
        s3.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon suzuki = new ImageIcon("Assets/Icons/Suzuki1.png");
        s3.setIcon(suzuki);
        s3.setHorizontalTextPosition(JButton.RIGHT);
        s3.addActionListener( this);
        //button 10
        s4 = new JButton();
        s4.setBounds(20, 470, 500, 70);
        // withdraw.addActionListener((ActionListener) this);
        s4.setText("      ITC                      +1.24%");
        s4.setFocusable(false);
        s4.setFont(new Font("Comic Sans", Font.BOLD, 25));

        s4.setForeground(Color.black);
        s4.setBackground(Color.lightGray);
        s4.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon mrf = new ImageIcon("Assets/Icons/itc.jpg");
        s4.setIcon(mrf);
        s4.setHorizontalTextPosition(JButton.RIGHT);
        s4.addActionListener( this);


        s2 = new JButton();
        s2.setBounds(20, 310, 500, 70);
        s2.setText("  Tata Motors        +0.70%");
        s2.setFocusable(false);
        s2.setFont(new Font("Comic Sans", Font.BOLD, 25));
        s2.setForeground(Color.black);
        s2.setBackground(Color.lightGray);
        s2.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon tata = new ImageIcon("Assets/Icons/tata.png");
        s2.setIcon(tata);
        s2.setHorizontalTextPosition(JButton.RIGHT);
        s2.addActionListener( this);
        frame.add(s1);frame.add(s2);frame.add(s3);frame.add(s4);frame.add(label);

        about = new JTextArea("\n\n 1.A stock (also known as equity) is a security that represents the ownership of a fraction of a corporation.\n"+
                "\n\n\n" + "\n 2.This entitles the owner of the stock to a proportion of the corporation's assets and profits equal to how much stock they own.\n " +
                "\n\n\n" +  "\n3.Units of stock are called \"shares.\"");

        about.setBackground(Color.black);
        about.setBounds(10,200,400,400);
        about.setLineWrap(true);
        about.setWrapStyleWord(true);
        about.setFont(new Font("Calibri",Font.PLAIN,15));
        about.setEditable(false);
        frame.add(about);
    }
    public void Tata(){
        String t = "";
        t += "\t\tTATA MOTORS";
        t += "\n" + "-".repeat(50);
        t += "\n" + "*********************************************";
        t += "\n" + "Stock : Current price : Performance";
        t += "\n" + "TATA | 2869.450 | Stock Increased by 0.7019 %";
        t += "\n" + "*********************************************";
        t += "\n" + "-".repeat(50);
        System.out.println(t);
        Message(t);
    }
    public void Nifty(){
        String t = "";
        t += "\t\tNIFTY 50";
        t += "\n" + "-".repeat(50);
        t += "\n" + "*********************************************";
        t += "\n" + "Stock : Current price : Performance";
        t += "\n" + "NIFTY 50 | 2869.450 | Stock Decreased by 1.0419 %";
        t += "\n" + "*********************************************";

        t += "\n" + "-".repeat(50);
        System.out.println(t);
        Message(t);
    }
    public void ITC(){
        String t = "";
        t += "\t\tITC LTD.";
        t += "\n" + "-".repeat(50);
        t += "\n" + "*********************************************";
        t += "\n" + "Stock : Current price : Performance";
        t += "\n" + "ITC LTD | 2869.450 | Stock Increased by 1.4119 %";
        t += "\n" + "*********************************************";
        t += "\n" + "-".repeat(50);
        System.out.println(t);
        Message(t);
    }
    public void Suzuki(){
        String t = "";
        t += "\t\tSuzuki";
        t += "\n" + "-".repeat(50);
        t += "\n" + "*********************************************";
        t += "\n" + "Stock : Current price : Performance";
        t += "\n" + "SUZUKI | 2869.450 | Stock Increased by 1.1419 %";
        t += "\n" + "*********************************************";
        t += "\n" + "-".repeat(50);
        System.out.println(t);
        Message(t);
    }
    public void Message(String message) {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, message);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == s2) {
            this.Tata();
        }
        if (e.getSource() == s4) {
            this.ITC();
        }
        if (e.getSource() == s3) {
            this.Suzuki();
        }
        if (e.getSource() == s1) {
            this.Nifty();
        }
    }
}


