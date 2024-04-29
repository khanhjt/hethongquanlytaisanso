package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class market implements ActionListener {
    JButton getdata, popular, indices;
    JTextField stock_name;
    private JFrame marketfrm = new JFrame();
    private JLabel mktlabel = new JLabel("MARKET");

    public market() {
        marketfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marketfrm.setSize(420, 420);
        marketfrm.setVisible(true);
        marketfrm.setLayout(null);
        marketfrm.getContentPane().setBackground(Color.black);
        mktlabel.setBounds(150, 0, 200, 50);
        mktlabel.setFont(new Font("Verdana", Font.BOLD, 25));
        mktlabel.setForeground(Color.cyan);


        JLabel stocknameLabel = new JLabel("Stock Name");
        stocknameLabel.setBounds(100, 100 - 50, 140, 25);
        stocknameLabel.setFont(new Font("Verdana", Font.ITALIC, 15));
        stocknameLabel.setForeground(Color.WHITE);

        stock_name = new JTextField();
        stock_name.setBounds(100 + 90, 100 - 50, 140, 25);
        stock_name.setPreferredSize(new Dimension(120, 25));

        getdata = new JButton("Get Data");
        getdata.setBounds(246 + 90, 100 - 50, 120, 25);
        getdata.addActionListener(this);
        getdata.setBorder(BorderFactory.createEtchedBorder());
        getdata.setBackground(Color.blue);
        getdata.setFont(new Font("Verdana", Font.ITALIC, 15));
        getdata.setForeground(Color.WHITE);
        getdata.setFocusable(false);

        popular = new JButton("Popular Stocks");
        popular.setBounds(70 + 90, 230 - 120, 120, 25);
        popular.addActionListener(this);
        popular.setBorder(BorderFactory.createEtchedBorder());
        popular.setBackground(Color.blue);
        popular.setFont(new Font("Verdana", Font.ITALIC, 15));
        popular.setForeground(Color.WHITE);
        popular.setFocusable(false);

        indices = new JButton("Market Indices");
        indices.setBounds(210 + 90, 230 - 120, 120, 25);
        indices.addActionListener(this);
        indices.setBorder(BorderFactory.createEtchedBorder());
        indices.setBackground(Color.blue);
        indices.setFont(new Font("Verdana", Font.ITALIC, 15));
        indices.setForeground(Color.WHITE);
        indices.setFocusable(false);

        marketfrm.add(indices);
        marketfrm.add(popular);
        marketfrm.add(getdata);
        marketfrm.add(stock_name);
        marketfrm.add(stocknameLabel);
        marketfrm.add(mktlabel);
    }

    public void displayMessage(String message) {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, message);
    }



    public void marketIndices() {
        String s = "";
        s += "\t\tMarket Indices";
        s += "\n" + "-".repeat(50);
        s += "\n" + "NYSE Composite index: $16,868.11";
        s += "\n" + "Dow Jones Industrial Average: $35,515.38";
        s += "\n" + "S&P 500 Index: $14,822.55";
        s += "\n" + "Russell 2000 Index: $2,223.11";
        s += "\n" + "Global Dow Realtime USD: $4,097.02";
        s += "\n" + "Dow Jones U.S. Total Stock Market Index: $46,820.65";
        s += "\n" + "NASDAQ 100 Index (NASDAQ Calculation): $15,136.68";
        s += "\n" + "NYSE Composite Index: $16,868.11";
        s += "\n" + "-".repeat(50);
        System.out.println(s);
        displayMessage(s);
    }
    public void get_pop_stocks() {
        String s = "";
        s += "\t\tPopular Stocks";
        s += "\n" + "-".repeat(50);
        s += "\n" + "*********************************************";
        s += "\n" + "Stock : Current price : Performance";
        s += "\n" + "GOOGL | 2869.450 | Stock Decreased by 0.3019 %";
        s += "\n" + "TXN | 186.370 | Stock Decreased by 2.0497 %";
        s += "\n" + "AAPL | 172.990 | Stock Decreased by 0.7687 %";
        s += "\n" + "*********************************************";
        s += "\n" + "Please check the console for more details";
        s += "\n" + "-".repeat(50);
        System.out.println(s);
        displayMessage(s);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
         if (e.getSource() == popular) {
            this.get_pop_stocks();
        }
        if (e.getSource() ==indices ) {
            this.marketIndices();
        }

    }

}

