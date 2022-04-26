package com.nttdata.demoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaMundoController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hola mundo desde Spring Boot";
    }

}
