package example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello Kiran!!!";
    }
}
