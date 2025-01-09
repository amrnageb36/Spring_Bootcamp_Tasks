package main.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/valiadtion")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC without Maven!");
        return "home";
    }
}
