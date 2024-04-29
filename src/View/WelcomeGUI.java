package View;

import javax.swing.*;
import java.awt.*;

public class WelcomeGUI extends JPanel {
    WelcomeGUI(){
        //attributes of welcome page are set
        HomePageGUI.profileGUI.setVisible(false);
        HomePageGUI.helpAndSupportGUI.setVisible(false);
        HomePageGUI.portfolioGUI.setVisible(false);
        HomePageGUI.investingGUI.setVisible(false);
        HomePageGUI.walletGUI.setVisible(false);
        HomePageGUI.newsAndArticlesGUI.setVisible(false);
        HomePageGUI.portfolioCryptoGUI.setVisible(false);
        HomePageGUI.investingCryptoGUI.setVisible(false);
        HomePageGUI.newsAndArticlesCryptoGUI.setVisible(false);
        this.setBackground(new Color(250,250,255));
        this.setBounds(300,150,1200,600);
        //all the required labels are added to the panel
        JLabel welcomeText = new JLabel("<html><u>Welcome to the World of Data.Stock and crypto</u></html>");
        JLabel tagLine = new JLabel("A platform where you can invest some money on stock market or on crypto currency");
        JLabel description1 = new JLabel("<html><br/><br/>A <b>stock market</b>, equity market, or share market is the aggregation of buyers and sellers of stocks (also called shares) which represent ownership claims on businesses; these may include<br/> " +
                                                                "securities listed on a public stock exchange, as well as stock that is only traded privately,such as shares of private companies which are sold to investors through equity crowdfunding<br/>" +
                                                                "in the stock market is most often done via stockbrokerages and electronic trading platforms. Investment is usually made with an investment strategy in mind.<br/><br/>" +
                                                                "Investment Stocks can be categorized by the country where the company is domiciled. For example, Nestlé and Novartis are domiciled in Switzerland and traded on the SIX Swiss<br/>" +
                                                                 "Exchange, so they may be considered as part of the Swiss stock market, although the stocks may also be traded on exchanges in other countries, for example, as American depositary<br/> " +
                                                                "receipts (ADRs) on U.S. stock markets.<br/><br/></html>");
        JLabel description2 = new JLabel("<html>A <b>cryptocurrency</b>, crypto-currency, or crypto is a collection of binary data which is designed to work as a medium of exchange wherein individual coin ownership records are stored in<br/>" +
                                            "a ledger which is a computerized database using strong cryptography to secure transaction records, to control the creation of additional coins, and to verify the transfer of coin ownership.<br/>" +
                                            "Some crypto schemes use validators to maintain the cryptocurrency. In a proof-of-stake model, owners put up their tokens as collateral. In return, they get authority over the token in <br/>" +
                                            "proportion to the amountthey stake." +
                                            "<br/><br/>Generally, these token stakers get additional ownership in the token over time via network fees, newly minted tokens or other such reward mechanisms.[3] Cryptocurrency does not exist <br/>" +
                                            "in physical form (like paper money) and is typically not issued by a central authority. Cryptocurrencies typically use decentralized control as opposed to a central vsct digital currency.<br/><br/><br/></html>");
        JLabel warning = new JLabel("<html>Investment involves risk. As a general rule, you should only trade in financial products that you are familiar with and understand the risk associated with them. The risk warning described in each financial product below is not exhaustive, you should carefully  <br/>" +
                                        "consider your investment experience, financial situation, investment objective, risk tolerance level and consult your independent financial adviser as to the suitability of your situation prior making any investment.<br/><br/><br/></html>");
        JButton letsGo = new JButton("Lets Go");
        //all the label attributes are set
        welcomeText.setFont(new Font("Copperplate Gothic Bold",Font.ROMAN_BASELINE,30));
        welcomeText.setBounds(230,0,1200,30);

        tagLine.setForeground(new Color(164, 164, 166));
        tagLine.setBounds(380,32,1200,16);

        description1.setFont(new Font("Calibri",Font.PLAIN,15));
        description1.setBounds(10,70,1200,170);

        description2.setFont(new Font("Calibri",Font.PLAIN,15));
        description2.setBounds(10,270,1200,170);

        warning.setFont(new Font("Calibri",Font.PLAIN,10));
        warning.setBounds(5,480,1200,60);

        //lets go button is created
        letsGo.setBackground(new Color(18, 30, 255));
        letsGo.setBounds(530,560,100,40);
        letsGo.setBorder(null);
        letsGo.setFont(new Font("Comic Sans",Font.BOLD,20));
        letsGo.setFocusPainted(false);
        letsGo.setForeground(new Color(255, 255, 255));
        //lets go button takes the user to the profile section
        letsGo.addActionListener(e ->{
            //welcome page gone, profile page is visible now
            this.setVisible(false);
            HomePageGUI.profileGUI.setVisible(true);
            //profile button activated
            SideMenu.profile.setForeground(new Color(18, 30, 255));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
        });
        //everything is added to the panel
        this.add(welcomeText);
        this.add(tagLine);
        this.add(description1);
        this.add(description2);
        this.add(warning);
        this.add(letsGo);

        this.setVisible(true);
        this.setLayout(null);
    }
}
