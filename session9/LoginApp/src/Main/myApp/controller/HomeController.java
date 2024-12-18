package Main.myApp.controller;

import Main.myApp.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController{
    @RequestMapping("/")
    public String showForm(Model model){

        model.addAttribute("userModel",new UserModel());
        return "formPage";

    }
}
