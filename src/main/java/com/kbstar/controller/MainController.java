package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("main", "main");
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("main", "login");
        return "index";
    }

    @RequestMapping("/password")
    public String password(Model model) {
        model.addAttribute("main", "password");
        return "index";
    }

    @RequestMapping("/chart")
    public String chart(Model model) {
        model.addAttribute("main", "charts");
        return "index";
    }

    @RequestMapping("/401")
    public String error401(Model model) {
        model.addAttribute("main", "401");
        return "401";
    }

    @RequestMapping("/404")
    public String error404(Model model) {
        model.addAttribute("main", "404");
        return "404";
    }

    @RequestMapping("/500")
    public String error500(Model model) {
        model.addAttribute("main", "500");
        return "500";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("main", "register");
        return "index";
    }

    @RequestMapping("/table")
    public String table(Model model) {
        model.addAttribute("main", "tables");
        return "index";
    }


    @RequestMapping("/product")
    public String product(Model model) {
        model.addAttribute("main", "registerProduct");
        return "index";
    }
}
