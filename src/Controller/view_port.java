package Controller;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class view_port {
    final JFrame frame = new JFrame();
    final JLabel vlabel = new JLabel("VIEW PORTFOLIO");
    private JTable table = new JTable();

    public view_port() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        vlabel.setBounds(150, 0, 300, 50);
        vlabel.setFont(new Font("Verdana", Font.BOLD, 25));
        vlabel.setForeground(Color.blue);
        frame.add(vlabel);

        // Column Names
        Object[] columns = {"Stock Name", "Stock ID", "Current Holding", "Total Investment", "Total Profit", "Total Sales(till date)"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        Object[][] d = {
                {"Tata", "4031", "54000.00", "25000.00", "19050.67", "12473.55"},
                {"ITC", "9087", "33450.00", "5000.00", "13750.67", "9453.95"},
                {"SUZUKI", "2344", "21340.00", "6647.00", "10500.00", "7673.50"},
                {"NIFTY 50", "8102", "17595.00", "6000.oo", "5050.67", "2473.55"}, {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},
                {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},

        };
        table.setBackground(Color.lightGray);
        table.setForeground(Color.black);
        Font font = new Font("Verdana", 1, 22);
        table.setFont(font);
        table.setRowHeight(30);
        // Initializing the JTable
        table = new JTable(d, columns) {
        };
        //frame.add(table);
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 70, 880, 420);

        frame.setLayout(null);

        frame.add(pane);
    }

}

