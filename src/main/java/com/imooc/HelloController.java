package com.imooc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asus on 9/4/2017.
 */
@RestController
public class HelloController {
    @Value("$copSize")

    private String cupSize;
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String say( ){
        System.out.print("dfd");
        return cupSize;

    }
}
