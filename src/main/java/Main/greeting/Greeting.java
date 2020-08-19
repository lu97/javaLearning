package Main.greeting;

import java.util.Random;

public class Greeting {
    private Long id;
    private String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }
    public Greeting(){
        this.id = new Random().nextLong();
        this.content = "Дефолтный контент, т.к. ничего не передаем";

    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
