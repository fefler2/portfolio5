package hello.Controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @GetMapping
    public String s(){
        return "s";
    }    @GetMapping("a")
    public String s2(){
        return "s2";
    }
}
