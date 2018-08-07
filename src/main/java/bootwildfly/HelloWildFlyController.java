package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        int a = 2;
        for (int i = 0; i < 20000; i++) {
        a=a*(i-1);
        }
        System.out.println(a);
        return ("hello, my friend");
    }
}
