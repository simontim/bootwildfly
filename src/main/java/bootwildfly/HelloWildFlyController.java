package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public double sayHello(){
        double a = 2;
        for (int i = 0; i < 200; i++) {
        a=a*(i+1);
        }
        
        return a;
    }
}
