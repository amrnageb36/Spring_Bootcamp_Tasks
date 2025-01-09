package main.java.com.example.controller;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


    @Controller
    public class HomeController {

        @RequestMapping("/")
        public String home() {
            return "home";
        }
    }
