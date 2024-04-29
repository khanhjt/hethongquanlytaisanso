package View;

import javax.swing.*;

import Controller.NewsAndArticlesCrypto;

import java.awt.*;

public class NewsAndArticlesCryptoGUI extends JPanel {
    NewsAndArticlesCryptoGUI() {
        NewsAndArticlesCrypto news = new NewsAndArticlesCrypto(); 

        String h1 = news.giveH1();
        String h2 = news.giveH2();
        String a1 = news.giveA1();
        String a2 = news.giveA2();
        String h3 = news.giveH3();
        String a3 = news.giveA3();

        this.setBackground(new Color(255, 255, 255));
        this.setBounds(300, 150, 1200, 600);
        this.setVisible(true);

        JLabel heading1 = new JLabel(h2, SwingConstants.CENTER);

        heading1.setPreferredSize(new Dimension(1200, 100));
        JTextArea article1 = new JTextArea(a2, 1, 1);
        article1.setEditable(false);
        article1.setLineWrap(true);
        article1.setMargin(new Insets(10, 10, 10, 10));

        JLabel heading2 = new JLabel(h3, SwingConstants.CENTER);
        JTextArea article2 = new JTextArea(a3, 1,1);
        article2.setEditable(false);
        article2.setLineWrap(true);
        article2.setMargin(new Insets(10, 10, 10, 10));

        JLabel heading3 = new JLabel(h1, SwingConstants.CENTER);
        JTextArea article3 = new JTextArea(a1, 1, 1);
        article3.setEditable(false);
        article3.setLineWrap(true);
        article3.setMargin(new Insets(10, 10, 10, 10));

        JPanel p = new JPanel(new GridLayout(10, 1));
        p.add(heading1);
        p.add(article1);
        p.add(heading2);
        p.add(article2);
        p.add(heading3);
        p.add(article3);

        this.add(p);
    }
}
