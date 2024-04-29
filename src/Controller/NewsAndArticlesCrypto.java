package Controller;

public class NewsAndArticlesCrypto extends NewsAndArticlesStock {
    private String heading3;
    private String article3;

    public NewsAndArticlesCrypto() {
        heading3 = "Is Nifty in expensive zone? Prashant Jain explains why valuations are reasonable";
        article3 = "Market valuations are fine, 10 per cent higher than long-term averages, Prashant Jain said.";
    }

    public String giveH3(){
        return heading3;
    }

    public String giveA3(){
        return article3;
    }
}
