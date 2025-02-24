package org.example.githubactionsdemov2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @GetMapping("")
    public String welcome(){
        return "welcome";
    }
}
