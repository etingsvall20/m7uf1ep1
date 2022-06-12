package springBootInitialDemo.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    String helloWorld() {
        return "HELLO WORLD";
    }

    @RequestMapping("/{username}")
    String helloWorld(
            @PathVariable(name="username") String userName) throws Exception {
        return "Hello, " + userName;
    }

}
