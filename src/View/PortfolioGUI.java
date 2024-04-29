package View;


//import Data.Portfolio;
//import Data.Stock;

//import org.json.JSONException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PortfolioGUI extends JPanel implements ActionListener {
    JButton wishlist,market;
    JButton i1,i2,i3,i4;
    JButton port,view,purchase,sale;
    JLabel heading;
    JPanel top,bottom,center,grid;
    PortfolioGUI() {
        //top heading
        heading = new JLabel("WELCOME TO STOCKS PORTFOLIO!", SwingConstants.CENTER);
        heading.setBounds(170,0,200,200);
        heading.setForeground(Color.black);
        heading.setFont(new Font("Verdana", Font.BOLD, 25));
        heading.setBackground(Color.white);
        heading.setOpaque(true);


        //BUTTON 1
        wishlist = new JButton();
        wishlist.setBounds( 300, 640, 300, 120);
        wishlist.addActionListener( this);
        wishlist.setText("Wishlist");
        wishlist.setFocusable(false);
        wishlist.setFont(new Font("Comic Sans", Font.BOLD, 25));

        wishlist.setForeground(Color.black);
        wishlist.setBackground(Color.lightGray);
        wishlist.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon wish = new ImageIcon("Assets/Icons/wishlist.png");//image icon
        wishlist.setIcon(wish);
        wishlist.setHorizontalTextPosition(JButton.RIGHT);

        //button 2
        market = new JButton();
        market.setBounds(700, 640, 300, 120);
        market.addActionListener( this);
        market.setText("Market");
        market.setFocusable(false);
        market.setFont(new Font("Comic Sans", Font.BOLD, 25));
        market.setForeground(Color.black);
        market.setBackground(Color.lightGray);
        market.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon mkt = new ImageIcon("Assets/Icons/Market1.png");
        market.setIcon(mkt);
        market.setHorizontalTextPosition(JButton.RIGHT);






        port = new JButton();
        port.setBounds(20, 230, 500, 70);
        port.addActionListener( this);
        port.setText("View Portfolio");
        port.setFocusable(false);
        port.setFont(new Font("Comic Sans", Font.BOLD, 25));
        port.setForeground(Color.white);
        port.setBackground(Color.blue);
        port.setBorder(BorderFactory.createEtchedBorder());
        port.addActionListener( this);
        port.setHorizontalTextPosition(JButton.RIGHT);


        purchase = new JButton();
        purchase.setBounds(20, 330, 500, 70);
        purchase.addActionListener( this);
        purchase.setText("Purchase History");
        purchase.setFocusable(false);
        purchase.setFont(new Font("Comic Sans", Font.BOLD, 25));
        purchase.setForeground(Color.white);
        purchase.setBackground(Color.blue);
        purchase.setBorder(BorderFactory.createEtchedBorder());

        purchase.setHorizontalTextPosition(JButton.RIGHT);


        sale = new JButton();
        sale.setBounds(20, 420, 500, 70);
        sale.addActionListener( this);
        sale.setText("Sale History");
        sale.setFocusable(false);
        sale.setFont(new Font("Comic Sans", Font.BOLD, 25));
        sale.setForeground(Color.white);
        sale.setBackground(Color.blue);
        sale.setBorder(BorderFactory.createEtchedBorder());

        sale.setHorizontalTextPosition(JButton.RIGHT);

        view= new JButton();
        view.setBounds(770, 305, 300, 70);
        view.addActionListener( this);
        view.setText("View Stock Details");
        view.setFocusable(false);
        view.setFont(new Font("Comic Sans", Font.BOLD, 25));
        view.setForeground(Color.white);
        view.setBackground(Color.blue);
        view.setBorder(BorderFactory.createEtchedBorder());

        //panels
        top = new JPanel();bottom = new JPanel(); center= new JPanel();

        top.setBackground(Color.white);
        bottom.setBackground(Color.white);
        center.setBackground(Color.white);

        top.setBounds(0,0,1200,70);
        bottom.setPreferredSize(new Dimension(50, 50));
        center.setBounds(0,70,1200,480);

        top.setLayout(new BorderLayout());
        center.setLayout(new BorderLayout());

        this.setLayout(new BorderLayout());


        this.add(wishlist);
        this.add(market);
        //this.add(Home);
        //this.add(back);
        // this.add(next);
        // this.add(deposit);
        // this.add(withdraw);
        this.add(port);
        this.add(view);
        this.add(purchase);
        this.add(sale);//this.add(i1);this.add(i2);this.add(i3);this.add(i4);
        top.add(heading);
        bottom.add(wishlist);
        bottom.add(market);
        // bottom.add(Home);



        this.add(top);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(center);

        bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        this.setBackground(new Color(250,250,255));
        this.setBounds(300,70,1200,700);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //Portfolio p=null;
        try {
            // p=new Portfolio(userId);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        if(e.getSource()==wishlist){
        }

        if(e.getSource()==market){
            System.out.println("Showing the market trends!");
        }

      if(e.getSource()==port){
       }
        if(e.getSource()==view){
        }
           if(e.getSource()==purchase){
        }
        if(e.getSource()==sale){
        }
        //Stock s=new Stock(stock);
        // p.displayStockPortfolio(s);

    }
}



