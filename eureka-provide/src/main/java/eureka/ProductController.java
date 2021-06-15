package eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/product")
    public String get(String param) throws InterruptedException {
        Thread.sleep(6000l);
        return "hello>>>"+param;
    }
}
