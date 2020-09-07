package Main.parse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ParserController {
    @RequestMapping("/parse")
    public List parser(@RequestParam(value = "url", required=false, defaultValue = "https://spring-projects.ru/guides/serving-web-content/")
                                   String url, String userAgent, String referrer, ParserParams params){

        try {
            Parser parser = new Parser();
            return parser.getList();
        } catch (IOException ex){
            System.out.println(ex.getStackTrace());
        }
        return null;
    }

}
