package Main.parse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static Main.parse.ParserConstantsFFF.TEST_URL;

public class Parser {
        String url;
        String userAgent;
        String referrer;
        Document document;


        public Parser(String url, String userAgent, String referrer) throws IOException {
            setUrl(url);
            setUserAgent(userAgent);
            setReferrer(referrer);
            document = getDocument(url, userAgent, referrer);
        }

        public Parser(String url) throws IOException{
            setUrl(url);
            document = getDocument(url);
        }

        public Parser() throws IOException{
            document = getDocument();
        }

        public List getList(){
            List result  = new ArrayList();
            Elements list = document.select("");

            return result;
        }




        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        public String getUserAgent() {
            return userAgent;
        }
        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
        }
        public String getReferrer() {
            return referrer;
        }
        public void setReferrer(String referrer) {
            this.referrer = referrer;
        }

        private Document getDocument(String url, String userAgent, String referrer) throws IOException{
          return  Jsoup.connect(url).userAgent(userAgent).referrer(referrer).get();
        }
        private Document getDocument(String url) throws IOException{
            return Jsoup.connect(url).get();
        }
        private Document getDocument() throws IOException{
            return Jsoup.connect(TEST_URL).get();
        }


}
