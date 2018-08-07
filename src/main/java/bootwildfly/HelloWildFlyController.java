package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public double sayHello(@RequestParam(value="n", defaultValue="5") int n){
        double a = 2;
        for (int i = 0; i < n; i++) {
        a=a*(i+1);
        }
        
        return a;
    }
}
