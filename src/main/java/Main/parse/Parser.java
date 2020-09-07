package Main.parse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Parser {
        String url;
        Document document;
        InputObject parseData;

        public Parser(InputObject inputObject) throws IOException{
            //document = getDocument();
        }
        public Parser() throws IOException{
            //document = getDocument();
        }

        public List getList(){
            List result  = new ArrayList();
            Elements list = document.select("");
            return result;
        }
        public InputObject getParseData() { return parseData; }
        public void setParseData(InputObject parseData) {
            this.parseData = parseData;
        }
        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }

        private Document getDocument(String url, String userAgent, String referrer) throws IOException{
          return  Jsoup.connect(url).userAgent(userAgent).referrer(referrer).get();
        }
        private Document getDocument(String url) throws IOException{
            return Jsoup.connect(url).get();
        }

    protected class InputObject {
           String url;
           String selectType;
           String dataFormat;
           String tag;
           Count count;
           String countType;

        public InputObject(String url, String selectType, String dataFormat, String tag, Count count, String countType) {
            this.url = url;
            this.selectType = selectType;
            this.dataFormat = dataFormat;
            this.tag = tag;
            this.count = count;
            this.countType = countType;
        }

        public String getUrl() {
            return url;
        }

        public String getSelectType() {
            return selectType;
        }

        public String getDataFormat() {
            return dataFormat;
        }

        public String getTag() {
            return tag;
        }

        public Count getCount() {
            return count;
        }

        public String getCountType() {
            return countType;
        }
    }
    protected class Count{
        Integer start;
        Integer end;

        public Count(Integer start, Integer end) {
            this.start = start;
            this.end = end;
        }

        public Integer getStart() {
            return start;
        }

        public void setStart(Integer start) {
            this.start = start;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }
    }
}
