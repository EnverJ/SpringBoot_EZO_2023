package io.ezospringboot.ezoapi.io.ezospringboot.ezoapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String SayHi() {
        return "Hi, EZO how you doing";
    }
}
