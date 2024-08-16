package headline;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



import java.io.IOException;

public class HeadlineFinder {
    public static void main(String[] args) {
        String url = "https://www.financialexpress.com/market/share-market-today-live-updates-sensex-nifty-rupee-vs-dollar-share-market-live-sensex-nifty-may-open-positive-gift-nifty-up-asian-markets-traded-mixed-on-june-13-2024-thursday-3523459/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements newsHeadlines = doc.select(".newspack_global_ad global_left_gutter skining-fixed");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}