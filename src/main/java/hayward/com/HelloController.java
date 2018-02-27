package hayward.com;

import org.springframework.web.bind.annotation.GetMapping;
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
}
