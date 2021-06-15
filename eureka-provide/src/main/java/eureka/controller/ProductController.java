package eureka.controller;

import eureka.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProductController {

    @Resource
    ProductService productService;

    @RequestMapping("/product")
    public String get(String param) throws InterruptedException {
        //Thread.sleep(6000l);
        return productService.get(param)+param;
    }
}
