package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class InvestingGUI extends JPanel {
    JTable jt;
    JButton buy;
    JTextArea nametxt,valuetxt,changeInValuetxt;
    InvestingGUI(){
        

        this.setBackground(new Color(250,250,255));
        this.setBounds(300,150,1200,600);
        // Creating data set for table
        String[] columns = {"Stock Name", "Price", "Change in price"};
        Object[][] d = {
                {"Reliance Inds.", " 2,386.00", " -0.71"},
                {"Tata Consultancy", " 3,729.10 ", " +0.97"},
                {"HDFC Bank", " 1,457.95 ", " +0.30"},
                {"Infosys", " 1,898", " +0.73"},
                {"Hindustan Unilever", " 2,311.40", " +0.18"},
                {"ICICI Bank", " 735.70", " 0.01"},
                {"HDFC", " 2594.25", " +0.05"},
                {"Bajaj Finanace L", " 6893.30", " -0.27"},
                {"SBI", " 451.50", " -0.63"},
                {"Wipro", " 27", " +0.288"},
                {"Bharti Airtel" , " 683.05" , " +0.95"},
                {"HCL Technologies"," 1,317.5"," +1.98"},
                {"Asian Paints"," 3,381.50"," +036"},
                {"Avenue Supermarts"," 4664.25"," -0.38"},
                {"ITC Ltd."," 216.95"," +0.07"},
                {"L&T"," 1890.70"," -0.09"},
                {"Bajaj Finserv Ltd."," 16007.00"," -1.45"},
                {"Maruti Suzuki Ltd."," 7312.5" , " -0.44"},
                {"Adani Green Energy"," 1,387.60"," -0.35"},
                {"UltraTech Cement"," 7,474.40"," +0.60"},
                {"Titan Company"," 2417.60"," +0.64"},
                {"Axis Bank Ltd."," 665.70"," -0.69"},
                {"Sun Pharma"," 837.55", " -0.09"},
                {"Adani Total Gas"," 1740.05","-0.13"},
                {"Power Grid Corpo"," 204.04"," +0.02"},
                {"Tata Steel"," 1110.00"," -0.55"},
                {"Hind. Zinc"," 315.65"," -0.02"},
                {"HDFC Life Insurance","642.5"," -0.33"},
                {"L&T infotech"," 7314.00"," +0.67"},
                {"Vedanta"," 335.50"," -1.15"},
                {" Pidilite Inds."," 2435.00"," +0.11"},
                {"Divi's Lab"," 4635.05"," +0.33"},
                {"NTPC"," 125.50"," +1.63"},
                {"SBI Life Insurance"," 1198.40"," +1.47"},
                {"Zomato"," 134.30"," -2.04"},
                {"Grasim Inds."," 1600.80","-0.16"},
                {"Indian Oil Corp"," 110.20"," -1.17"},
                {"Mahi. & Mahi"," 833.10"," +0.09"},
                {"FSN E-Commerce Ventu"," 2514.80"," -0.09"},
                {"Hindalco Indus"," 451.70"," -0.53"},
                {"Dabur India"," 567.20"," +0.09"}


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

        this.setVisible(true);
    }
}
