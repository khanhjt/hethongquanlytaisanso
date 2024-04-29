package Controller;


public class NewsAndArticlesStock {

    private String heading1;
    private String article1;
    private String heading2;
    private String article2;

    public NewsAndArticlesStock() {
        heading1 = "Market Movers: Covid curbs dampen bull case for hospitality sector";
        article1 = "Investors are worried that risk aversion among consumers is likely to further dampen the March and June quarter earnings of hotel companies just when they were showing signs of revival";
        heading2 = "Tech View: Nifty forms Doji candle; index support at 17,100, say analysts";
        article2 = "Analysts see support for the index at 17,100 while they see resistance at 17,300 level";

    }

    public String giveH1() {
        return heading1;
    }

    public String giveH2() {
        return heading2;
    }

    public String giveA1() {
        return article1;
    }

    public String giveA2() {
        return article2;
    }

}




