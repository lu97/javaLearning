package Main.greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required=false, defaultValue = "World") String name){
        return new Greeting();
    }
}
