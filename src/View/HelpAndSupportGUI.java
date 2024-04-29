package View;

import javax.swing.*;
import java.awt.*;

public class HelpAndSupportGUI extends JPanel {

    HelpAndSupportGUI(){

        JLabel header = new JLabel("<html><u>Hey there! Looking for Some Help ?!</u></html>");
        JTextArea faq = new JTextArea("\n\n Here are a few questions to help you figure out:- " +
        
                "\n\n\n     1)  How to find Good Companies as there are many publicly listed companies in the Indian Stock market?\n\n" +
                "Ans)  An easier way to do so is to use a Stock Screener. A Stock screener is a tool to choose a few companies from a pool of all the listed companies on a Stock exchange using filters. The individuals can apply some filters like valuations, the market cap of the company etc. The filters should be specific to the industry that the individual is analysing and get a list of Stocks based on the criteria applied.\n" +
                "\n\n\n" +
                "     2)  How much time should I spend while researching Stocks?\n\n" +
                "Ans)  It depends on whether you as an individual are selecting the Stock for trading or for long-term investment. If you are trading in Stocks, then there is no need to spend a lot of time on fundamentals. Rather, here you should read charts, trends, patterns etc and get more involved in the day-to-day market activity.\n" +
                "\n" +
                "On the contrary, if you are investing for the long-term then more time should be invested while studying the Stocks. It is essential to check the fundamentals of the company, its management, financial, competitors etc if the investment horizon is of more than 1 year.\n" +
                "\n\n\n" +
                "     3)  Where can I get the company\'s financial report and other information?\n\n" +
                "Ans)  The company information is easily available on Stocks exchanges (NSE, BSE), company website under investor relations or about us section of the website. The information is also available on other financial websites like money control, screener.com etc.\n" +
                "\n" +
                "We also recommend reading the annual reports of the company to have a deep understanding of the company\'s business and its future prospects.\n\n" +
                "\n\n\n" +
                "     4)  Should I invest in the upcoming IPOs?\n\n" +
                "Ans)  IPOs are the products of the Bull Market. The companies generally get public when everything is good in the market like people are optimistic, the economy is doing well to earn listing profits. The real test of a company is during the bear market i.e how they survive in the falling market.\n" +
                "\n" +
                "If the individual can find such IPOs that are very promising (good business model, strong financials, efficient management, decent valuation etc), then feel free to invest in them.\n" +
                "\n" +
                "Also read: \"What to consider before investing in an IPO\"\n\n" +
                "\n\n\n" +
                "     5)  Is investing in Small-Caps more profitable than bluechip companies?\n\n" +
                "Ans)  Small-cap companies have the potential to grow faster compared to bluechip companies. There can be a number of hidden gems in the small-cap industry that are yet not discovered by the market. On the other hand, large-cap companies have already proved their potential to the market.\n" +
                "\n" +
                "Besides, the quality of Stock is more important than the size of the company. There are a number of large-cap companies which has consistently given good returns to their shareholders. Overall, investing in small caps can be more profitable than large caps only if the fundamentals and future prospects of the business look promising.\n" +
                "\n\n\n" +
                "     6)  Should I Invest in Stocks when the market is at high?\n\n" +
                "Ans)  If the market is high, then start making the watchlist of Stocks. Keep an eye on the Stocks with good fundamentals. If the investor finds some good Stocks and is ready to invest, then avoid lump sum investment. Average out the Stocks, this will reduce the chances of buying Stocks at a high price.\n" +
                "\n\n\n" +
                "     7)  What kind of Stocks should be avoided for investment?\n\n" +
                "Ans)  The individual should avoid investing in Stocks having low liquidity. The low liquidity makes it hard to trade in these Stocks. Additionally, finding the data for analysing these companies might be hard as information on public platforms is generally not easily available. Thus, lack of research may result in loss-making investments. Additionally, one should also avoid investing in penny Stocks.\n" +
                "\n\n\n" +
                "     8)  How many Stocks should I buy in my portfolio?\n\n" +
                "Ans)  The portfolio should not be over diversified as over-diversification does not yield good results and it becomes difficult to keep an eye on all the Stocks. Similarly, the portfolio should not also be concentrated in one or two Stocks/ industries as a tremendous fall in the price of one Stock will adversely affect the overall portfolio performance.\n" +
                "\n" +
                "Usually, investors can have 8-10 Stocks in the portfolio depending on the amount of investment.\n" +
                "\n\n\n" +
                "     9)  How much returns can I expect from the market?\n\n" +
                "Ans)  A Stock portfolio will include multiple Stocks. Sometimes, some Stocks will perform exceedingly well, while some will not. The portfolio return will be the result of performing and non-performing Stocks.\n" +
                "\n" +
                "In the bull market, the portfolio will give attractive returns (the benchmark index Nifty gave a return of ~67% from April 01,2020 till December 18,2020. However, during a bad market- the returns can be as low as 1-2% or market returns can also be negative.\n" +
                "\n\n\n" +
                "   10)  How can I track my Stock portfolio?\n\n" +
                "Ans)  To be a successful investor it is important to do portfolio analysis at regular intervals. But how exactly to track your Stock portfolio? Is it only checking the Stock price movement? Or is there much more to check?" +
                "\n\n\n" +
                "   11)  What is cryptocurrency?\n\n" +
                "Ans)  Refers to a digital currency, secured with cryptography to enable trusted transactions. Blockchain is the underlying technology, functioning as a \'ledger\' or record of transactions made.\n" +
                "Hundreds of currencies are in circulation, such as Bitcoin, Ether, Monero, etc. Each is designed by one or more brilliant individuals, usually meant to run as a decentralised system so that no single entity can control it.\n" +
                "Cryptocurrency units are usually generated on the basis of an algorithm announced to everyone in advance, by \'miners\' using powerful computers. Having expended a lot of time and electricity on \'mining\', these miners can hold on to the units or sell to others.\n" +
                "\n\n\n" +
                "   12)  How is crypto stored?\n\n" +
                "Ans)  Let\'s look at a national currency like the rupee. It can be deposited in your name at a vsct, or privately stuffed into a mattress at home far away from anyone\'s eyes.\n" +
                "Similarly, a cryptocurrency can be held on your behalf by a company, usually in your wallet at a crypto exchange online. You could also hold it in without being affiliated to anybody, in a private cryptocurrency wallet.\n" +
                "\n\n\n" +
                "   13)  What is the purpose of cryptocurrency?\n\n" +
                "Ans)  As indicated by \'currency\', they were originally intended to be used in the same way as rupees and dollars are, as a medium of payment between people for products and services purchased.\n" +
                "Consider store reward cards, an alternative physical payment method that is denominated in their own units, and not in national currency. Similarly, cryptocurrency with its own units was meant to enable easy digital transactions online, at lower costs than what conventional vscts charged.\n" +
                "\n\n\n" +
                "   14)  Is cryptocurrency used for illegal activities?\n\n" +
                "Ans)  Initially with no government control, crypto became a useful tool to escape political censors and repressive regimes, which was an admirable goal. However, crypto eventually became known as a method of transacting for illegal substances on hidden parts of the internet.\n" +
                "Governments discourage such behaviour and made use of crypto\'s built-in ledger to pursue criminals. With the extent of tracking that is now possible in 2021, it is safe to say that it is difficult to use cryptocurrency for crime. Bitcoin for instance, sees over 300,000 transactions daily on average, with crypto exchange trades accounting for over half of them in the last two years.\n" +
                "\n\n\n" +
                "   15)  How does supply and demand work in the cryptocurrency market?\n\n" +
                "Ans)  Some cryptocurrencies like Bitcoin and Ether are designed to have a limited supply. By comparison, real-world currencies like the US Dollar do not have a hard limit on supply. When demand increases, the value of a supply-limited item is expected to increase.\n" +
                "That difference in supply, a high demand for crypto and new ways to profit from rising crypto, have led to a self-perpetuating cycle that drives up the exchange value of major cryptocurrencies.\n" +
                "\n\n\n" +
                "   16)  How to start trading in cryptocurrencies?\n\n" +
                "Ans)  Fundamentally, a seller sells their currency to gain cash and a buyer buys expecting to hold the currency until its value increases in dollar/rupee terms.\n" +
                "In mid-August 2021, the total market value of all cryptocurrency exceeded $2 trillion, with Bitcoin alone making up 44% of that. As the graph above shows, a currency can start small and reach very high – but with a number of bumps along the way.\n" +
                "People with a lot of faith in the future of cryptocurrencies subscribe to a \'HODL\' mindset, meaning \'hold on for dear life\' to the roller-coaster they expect to ride. They buy and do not intend to sell anytime soon, even claiming that the value of one Bitcoin could rise from $50,000 today to $288,000 in a few years.\n" +
                "Others choose the day trading route – buy a currency, target a profit percentage as low as 2% and sell as soon as that target is reached – sometimes within hours.\n" +
                "\n\n\n" +
                "   17)  How to trade in cryptocurrencies in a safe way?\n\n" +
                "Ans)  For beginners in the crypto market, experts advise investing only as much money as you\'re willing to lose. The reason is, crypto trading marries the \'irrational exuberance potential\' of a conventional Stock market to the regulatory uncertainty of crypto.\n" +
                "Also, hackers have shown that anything financially valuable on the internet is a juicy target. However, crypto exchanges that hold user wallets try to stay safe by employing armies of security experts and paying \'bug bounties\' to external consultants who identify vulnerabilities.\n" +
                "\n\n\n" +
                "   18)  What questions should I be asking about crypto?\n\n" +
                "Ans)  The first question one may have to address is which currency to buy. The biggest one, Bitcoin, would be a good starting point to begin investing right away.\n" +
                "One could later branch into other coins and tokens as per observations/confidence. As with Stocks, researching the cryptocurrency of choice is always helpful.\n" +
                "The second question is adopting a safe trading method. To begin with, a simple \'buy and hold\' may be preferable. Long term investors could carry over the \'rupee cost averaging\' (RCA) low-risk strategy from the Stock market.\n" +
                "An example of RCA would be setting a budget of ₹1000 a month, and buying crypto for exactly that much regularly each month, regardless of price dips or peaks. After gaining confidence, many more strategies could be used.\n" +
                "The third question would be choosing a crypto exchange. Picking a well-known exchange backed by big names internationally, one that is likely to still be growing 2-3 years later could allow peace of mind that one\'s investment is safe. CoinDCX and WazirX are both good starting points for Indian investors.\n" +
                "After gaining confidence, one could consider comparing exchanges on factors such as currency pairs offered, transaction costs, ease of transaction, security, leverage availability, futures, NFT purchases, earnings from DeFi lending, and so on.\n" +
                "\n\n\n" +
                "   19)  How do I make money by trading cryptocurrencies?\n\n" +
                "Ans)  There are three things to be aware of when one is ready to take profits on investment. Like all business, trading in crypto has additional expenses to keep in mind.\n" +
                "First of all, exchange transaction fees that apply to all actions between infusing cash and exiting investments at a profit.\n" +
                "Secondly, unexpected movements in price could mean holding onto crypto for longer than initially expected.\n" +
                "Thirdly, taxes that fall due at the end of the year. Depending on income tax bracket, people may have differing minimum profit targets. Frequently forgotten until the end of the financial year, keeping this factor in mind could help one enjoy their gains in moderation." +
                "\n\n\n\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n\n" );
        
        JScrollPane scrollPane = new JScrollPane(faq);

        scrollPane.setBounds(40,50,1160,650);
        scrollPane.setBorder(null);

        header.setFont(new Font("Copperplate Gothic Bold",Font.ROMAN_BASELINE,30));
        header.setBounds(350,0,1175,50);

        faq.setBackground(new Color(250, 250, 255));
        faq.setLineWrap(true);
        faq.setWrapStyleWord(true);
        faq.setFont(new Font("Calibri",Font.PLAIN,15));
        faq.setEditable(false);

        this.add(scrollPane);
        this.add(header);
        this.setBackground(new Color(250, 250, 255));
        this.setBounds(300, 70, 1250, 700);
        this.setVisible(true);
        this.setLayout(null);
    }
}
