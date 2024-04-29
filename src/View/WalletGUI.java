package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;

import javax.swing.JPanel;
import javax.swing.JTable;


public class WalletGUI extends JPanel {
    JButton withdraw_funds, deposit_funds, Home, deposit, withdraw, back, next, s1, s2, s3, s4;
    JButton i1, i2, i3, i4;
    JLabel heading, Current_Balance, Last_Transcation,Recent_Activity;
    JPanel top, bottom, center, grid;
    JTable table;

    WalletGUI() {
 

        // top heading
        
        heading = new JLabel("WALLET", SwingConstants.CENTER);
        heading.setBounds(170, 0, 200, 200);
        heading.setForeground(Color.black);
        heading.setFont(new Font("Verdana", Font.BOLD, 25));
        heading.setBackground(Color.white);
        heading.setOpaque(true);
        

        Current_Balance = new JLabel("Current Balance: $9980", SwingConstants.CENTER);
        Current_Balance.setBounds(100, 170, 400, 50);
        Current_Balance.setForeground(Color.WHITE);
        Current_Balance.setFont(new Font("Verdana", Font.BOLD, 25));
        Current_Balance.setBackground(Color.BLACK);
        Current_Balance.setOpaque(true);
        // Current_Balance.setIcon(emptyError);

        Last_Transcation = new JLabel("Last Transcation: $260", SwingConstants.CENTER);
        Last_Transcation.setBounds(100, 250, 400, 50);
        Last_Transcation.setForeground(Color.WHITE);
        Last_Transcation.setFont(new Font("Verdana", Font.BOLD, 25));
        Last_Transcation.setBackground(Color.BLACK);
        Last_Transcation.setOpaque(true);

        Recent_Activity = new JLabel("Recent Activities : ", SwingConstants.CENTER);
        Recent_Activity.setBounds(100, 330, 400, 50);
        Recent_Activity.setForeground(Color.WHITE);
        Recent_Activity.setFont(new Font("Verdana", Font.BOLD, 25));
        Recent_Activity.setBackground(Color.BLACK);
        Recent_Activity.setOpaque(true);

        // BUTTON 1
        withdraw_funds = new JButton();

        withdraw_funds.setLocation(100, 560);
        withdraw_funds.setSize(1000, 30);

        withdraw_funds.setText("Withdraw Funds");
        withdraw_funds.setFocusable(false);
        withdraw_funds.setFont(new Font("Comic Sans", Font.BOLD, 25));

        withdraw_funds.setForeground(Color.black);
        withdraw_funds.setBackground(Color.cyan);
        withdraw_funds.setBorder(BorderFactory.createEtchedBorder());
        withdraw_funds.setHorizontalTextPosition(JButton.RIGHT);

        // button 2
        deposit_funds = new JButton();
        // withdraw_funds.setBounds( 300, 640, 300, 120);
        deposit_funds.setLocation(530, 560);
        deposit_funds.setSize(1000, 30);
        // deposit_funds.addActionListener((ActionListener) this);
        deposit_funds.setText("Deposit Funds");
        deposit_funds.setFocusable(false);
        deposit_funds.setFont(new Font("Comic Sans", Font.BOLD, 25));
        deposit_funds.setForeground(Color.black);
        deposit_funds.setBackground(Color.cyan);
        deposit_funds.setBorder(BorderFactory.createEtchedBorder());

        deposit_funds.setHorizontalTextPosition(JButton.RIGHT);

        back = new JButton();
        back.setBounds(10, 0, 50, 50);
        back.setFocusable(false);
        back.setBackground(Color.cyan);
        back.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon backi = new ImageIcon("back.png");
        back.setIcon(backi);

        next = new JButton();
        next.setBounds(80, 0, 50, 50);

        next.setFocusable(false);
        next.setBackground(Color.cyan);
        next.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon nexti = new ImageIcon("Assets/Icons/next.png");
        next.setIcon(nexti);

        top = new JPanel();
        bottom = new JPanel();
        center = new JPanel();

        top.setBackground(Color.white);
        bottom.setBackground(Color.gray);
        center.setBackground(Color.black);

        top.setBounds(0, 0, 1200, 70);
        bottom.setPreferredSize(new Dimension(50, 50));
        center.setBounds(0, 70, 1200, 480);

        top.setLayout(new BorderLayout());
        center.setLayout(new BorderLayout());

        this.setLayout(new BorderLayout());

        this.add(withdraw_funds);
        this.add(deposit_funds);
        this.add(Recent_Activity);
        this.add(Current_Balance);
        this.add(Last_Transcation);

        this.add(back);
        this.add(next);

        top.add(heading);
        bottom.add(withdraw_funds);
        bottom.add(deposit_funds);

        this.add(top);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(center);

        bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        this.setBackground(new Color(250, 250, 255));
        this.setBounds(300, 70, 1200, 700);
        this.setVisible(true);
    }
}
