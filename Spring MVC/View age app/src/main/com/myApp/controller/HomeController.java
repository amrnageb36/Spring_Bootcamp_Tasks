package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showfrom(){
        return "formPage";
    }



    @RequestMapping("/processPage")
    public String showProcess(@RequestParam("year")String year,
                              @RequestParam("month")String month,
                              @RequestParam("day")String day
                             , Model model)
    {



        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);




        return "homePage";
    }
}

