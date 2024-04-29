package View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.*;


public class InvestingCryptoGUI extends JPanel {
    JTable jt;
    JButton buy;
    JTextArea nametxt,valuetxt,changeInValuetxt;

    InvestingCryptoGUI() {
        this.setBackground(new Color(250, 250, 255));
        this.setBounds(300, 150, 1200, 600);


        // Creating data set for table
        String[] columns = {"Crypto Name", "Price", "Change in price"};
        Object[][] d = {
                {"Bitcoin", "100", " 0.10"},
                {"Ethereum", " 67 ", "0.15"},
                {"Binance Coin", " 78 ", "0.01"},
                {"Tether", "46", " 0.24"},
                {"Solana", "578", " 0.84"},
                {"Cardano", "547", " 0.136"},
                {"USD Coin", "92", " 0.47"},
                {"XRP", "48", " 0.139"},
                {"Terra", "5812", " 0.137"},
                {"Polkadot", "27", " 0.288"},
                {"Avalanche", "218", " 0.202"},
                {"Dogecoin", "279", " 0.27"},
                {"Shiba Inu", "328", " 0.28"},
                {"Polygon", "278", " 0.237"},
                {"Binance USD", "272", " 0.127"},
                {"Wrapped Bitcoin", "327", " 0.12"},
                {"Uniswap", "237", " 0.30"},
                {"Litecoin", "326", " 0.25"},
                {"Terre USD", "25", " 0.29"},
                {"Algorand", "56", " 0.12"},
                {"Dai", "238", " 0.20"},
                {"Bitcoin Cash", "27", " 0.328"},
                {"TRON", "27", " 0.28"},
                {"Stellar", "271", " 0.37"},
                {"Cosmos", "2327", " 0.328"},
                {"Fantom", "2376", " 0.28"},
                {"The Sandbox", "56", " 0.38"},
                {"Hedera", "5237", " 0.38"},
                {"IOTA", "36", " 0.38"},
                {"Helium", "328", " 0.39"},
                {"Aave", "238", " 0.39"},
                {"Gala", "29", " 0.20"},
                {"The Graph", "29", " 0.218"},
                {"EOS", "218", " 0.12"},
                {"Pancake swap", "59", " 0.1329"},
                {"Stacks", "38", " 0.28"},
                {"Flow", "28", " 0.29"},
                {"Maker", "2189", " 0.28"},
                {"Quant", "29", " 0.28"},
                {"Amp", "218", " 0.28"},
                {"eCash", "219", " 0.128"},
                {"Neo", "271", " 0.128"},
                {"Celo", "217", " 0.237"},


        };

        JLabel name = new JLabel("Name");
        name.setBounds(50,520,200,20);

        nametxt = new JTextArea();
        nametxt.setBounds(50,540,200,20);
        nametxt.setEditable(false);
        nametxt.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel value = new JLabel("Value");
        value.setBounds(320,520,200,20);

        valuetxt = new JTextArea();
        valuetxt.setBounds(320,540,200,20);
        valuetxt.setEditable(false);
        valuetxt.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel changeInValue = new JLabel("Change in value");
        changeInValue.setBounds(590,520,200,20);

        changeInValuetxt = new JTextArea();
        changeInValuetxt.setBounds(590,540,200,20);
        changeInValuetxt.setEditable(false);
        changeInValuetxt.setBorder(BorderFactory.createLineBorder(Color.black));


        // JTable initialization
        jt = new JTable(d, columns){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = jt.getSelectedRow();
                TableModel model = jt.getModel();
                nametxt.setText(model.getValueAt(i,0).toString());
                valuetxt.setText(model.getValueAt(i,1).toString());
                changeInValuetxt.setText(model.getValueAt(i,2).toString());
            }
        });
        jt.setBounds(0, 0, 1200, 500);

        buy = new JButton("Buy");
        buy.setBounds(860,530,130,30);
        buy.setBackground(new Color(18, 30, 255));
        buy.setForeground(new Color(255,255,255));
        buy.setFocusable(false);

        buy.addActionListener(e ->{
            if(nametxt.getText().isBlank()||valuetxt.getText().isBlank()||changeInValuetxt.getText().isBlank()){
                JOptionPane.showMessageDialog(this,"Please select a Crypto first");
            }else{
                String[] data = {nametxt.getText(),valuetxt.getText(),changeInValuetxt.getText()};
                PortfolioCryptoGUI.dtm.addRow(data);
                PortfolioCryptoGUI.jt.setModel(PortfolioCryptoGUI.dtm);
                JOptionPane.showMessageDialog(this,"Purchase successful");
                nametxt.setText("");
                valuetxt.setText("");
                changeInValuetxt.setText("");
                ++PortfolioCryptoGUI.numberOfCrypto;
            }
        });

        JScrollPane scrollPane = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(null);
        scrollPane.setBounds(0, 0, 1200, 500);
        scrollPane.setBackground(new Color(250, 250, 255));

        this.add(buy);
        this.add(changeInValue);
        this.add(changeInValuetxt);
        this.add(valuetxt);
        this.add(value);
        this.add(name);
        this.add(nametxt);
        this.add(scrollPane);
        this.setVisible(true);
        this.setLayout(null);

    }
}

