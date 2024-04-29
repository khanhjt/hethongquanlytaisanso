package Controller;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class sale{
    final JFrame frame = new JFrame();
    final JLabel label = new JLabel("SALE HISTORY");
    private JTable table = new JTable();

    public sale() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        label.setBounds(150, 0, 300, 50);
        label.setFont(new Font("Verdana", Font.BOLD, 25));
        label.setForeground(Color.blue);
        frame.add(label);

        // Column Names
        Object[] columns = {"Sale Date ", "Stock ", "Quantity Sold", "Amount Recieved"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        Object[][] d = {

                {"12/12/2021", "PARLE", "1000", "8970.00"},
                {"30/12/2021", "MRF", "15", "3261.75"}, {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},
                {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},{"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},
                {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},{"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},

        };
        table.setBackground(new Color(0x643580));
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



