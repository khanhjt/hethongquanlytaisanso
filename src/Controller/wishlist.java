package Controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class wishlist   {
    private JFrame frame = new JFrame();
    private JLabel label = new JLabel("WISHLIST");
    private  JTable table = new JTable();


    public wishlist() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        label.setBounds(150, 0, 200, 50);
        label.setFont(new Font("Verdana", Font.BOLD, 25));
        label.setForeground(Color.cyan);



        Object[] columns = {"Stock Name ","Stock ID","Price"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.lightGray);
        table.setForeground(Color.black);
        Font font = new Font("Verdana",1,22);
        table.setFont(font);
        table.setRowHeight(30);

        // create JTextFields
        JTextField textname = new JTextField();
        JTextField textid = new JTextField();
        JTextField textprice = new JTextField();
        textid.setBounds(100, 220, 100, 25);
        textname.setBounds(100, 250, 100, 25);
        textprice.setBounds(100, 280, 100, 25);

        JLabel lblNewLabel_1 = new JLabel("Stock ID");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 8));
        lblNewLabel_1.setBounds(20, 220, 60, 25);
        lblNewLabel_1.setForeground(Color.black);

        JLabel lblNewLabel_2 = new JLabel("Stock NAME");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 8));
        lblNewLabel_2.setBounds(20, 250, 60, 25);
        lblNewLabel_2.setForeground(Color.black);

        JLabel lblNewLabel_3 = new JLabel("Stock Price");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 8));
        lblNewLabel_3.setBounds(20, 280, 60, 25);
        lblNewLabel_3.setForeground(Color.black);

        JButton btnAdd = new JButton("Add ");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        btnAdd.setBounds(250, 220, 100, 25);
        btnUpdate.setBounds(250, 265, 100, 25);
        btnDelete.setBounds(250, 310, 100, 25);
        btnAdd.setForeground(Color.white);
        btnAdd.setBackground(Color.blue);
        btnAdd.setBorder(BorderFactory.createEtchedBorder());
        btnUpdate.setForeground(Color.white);
        btnUpdate.setBackground(Color.blue);
        btnUpdate.setBorder(BorderFactory.createEtchedBorder());
        btnDelete.setForeground(Color.white);
        btnDelete.setBackground(Color.blue);
        btnDelete.setBorder(BorderFactory.createEtchedBorder());

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);

        frame.setLayout(null);

        frame.add(pane);
        // add JTextFields to the jframe
        frame.add(textid);
        frame.add(textname);
        frame.add(textprice);


        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(label);
        frame.add(lblNewLabel_1); frame.add(lblNewLabel_2);frame.add(lblNewLabel_3);
        // create an array of objects to set the row data
        Object[] row = new Object[4];

        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = textid.getText();
                row[1] = textname.getText();
                row[2] = textprice.getText();


                // add row to the model
                model.addRow(row);
            }
        });

        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });

        // get selected row data From table to textfields
        table.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                // i = the index of the selected row
                int i = table.getSelectedRow();

                textid.setText(model.getValueAt(i, 0).toString());
                textname.setText(model.getValueAt(i, 1).toString());
                textprice.setText(model.getValueAt(i, 2).toString());

            }
        });

        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if(i >= 0)
                {
                    model.setValueAt(textid.getText(), i, 0);
                    model.setValueAt(textname.getText(), i, 1);
                    model.setValueAt(textname.getText(), i, 2);

                }
                else{
                    System.out.println("Update Error");
                }
            }
        });

        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}



