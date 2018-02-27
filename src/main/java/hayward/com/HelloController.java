package hayward.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hayward
 * @date 2018/2/27 0027  11:01
 */
@RestController
public class HelloController {
    @GetMapping("/Hello")
    public String hello(){

        return "hello world!";
    }
    @RequestMapping("/dhh")
    public String test(){
        return "Hayward";
    }
}
