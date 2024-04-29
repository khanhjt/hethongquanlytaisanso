package Controller;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Purchase {
    final JFrame frame = new JFrame();
    final JTable label = new JTable();
    private JTable table = new JTable();   

    public Purchase() {
        frame.setTitle("Lịch sử mua hàng");
        frame.setSize(420, 420); // set kích thước cho frame
        frame.setVisible(true); // hiển thị frame
        frame.setLayout(new BorderLayout()); // set layout cho frame la BorderLayout
        frame.getContentPane().setBackground(Color.white); // set màu nền cho frame
        label.setBounds(150, 0, 300, 50); // set vị trí và kích thước cho label
        label.setFont(new Font("Verdana", Font.BOLD, 20)); // set font cho label
        label.setForeground(Color.blue); // set màu chữ cho label
        frame.add(label); // thêm label vào frame

        Object[] columns = {"Ngày mua","Mua cổ phiếu","Số lượng", "Số tiền đầu tư"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        Object[][] d = {
            {"25/04/2024", "VNM", "100", "10000000"},
            {"26/04/2024", "VNM", "100", "10000000"},
            {"27/04/2024", "VNM", "100", "10000000"},
            {"28/04/2024", "VNM", "100", "10000000"},
            {"29/04/2024", "VNM", "100", "10000000"},
            {"30/04/2024", "VNM", "100", "10000000"},
            {"01/05/2024", "VNM", "100", "10000000"},
            {"02/05/2024", "VNM", "100", "10000000"},
            {"03/05/2024", "VNM", "100", "10000000"},
            {"04/05/2024", "VNM", "100", "10000000"},
            {"05/05/2024", "VNM", "100", "10000000"},
            {"06/05/2024", "VNM", "100", "10000000"},
            {"07/05/2024", "VNM", "100", "10000000"},
            {"08/05/2024", "VNM", "100", "10000000"},
            {"09/05/2024", "VNM", "100", "10000000"},
            {"10/05/2024", "VNM", "100", "10000000"},
            {"11/05/2024", "VNM", "100", "10000000"},
            {"12/05/2024", "VNM", "100", "10000000"},
            {"13/05/2024", "VNM", "100", "10000000"},
            {"14/05/2024", "VNM", "100", "10000000"},
            {"15/05/2024", "VNM", "100", "10000000"},
            {"16/05/2024", "VNM", "100", "10000000"},
            {"17/05/2024", "VNM", "100", "10000000"},
            {"18/05/2024", "VNM", "100", "10000000"},
    };
    table.setBackground(new Color(0x643580));
    table.setForeground(Color.black);
    Font font = new Font("Verdana",1,22);
    table.setFont(font);
    table.setRowHeight(30);
    table = new JTable(d, columns) {};
    JScrollPane pane = new JScrollPane(table);
    pane.setBounds(0, 70, 880, 420);
    frame.setLayout(null);
    frame.add(pane);
    }
}