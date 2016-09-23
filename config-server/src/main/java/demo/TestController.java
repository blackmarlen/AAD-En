package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mdumitru on 9/23/2016.
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String showLuckyWord() {
        return "Test enter here";
    }
}
