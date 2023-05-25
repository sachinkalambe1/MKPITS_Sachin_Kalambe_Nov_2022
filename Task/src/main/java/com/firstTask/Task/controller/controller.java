package com.firstTask.Task.controller;

import com.firstTask.Task.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/reg")
    public  String userREgistration(@ModelAttribute User user, Model model){
        System.out.println(user.toString());

        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getDob());
        System.out.println(user.getEmail());

        model.addAttribute("firstname",user.getFname());
        model.addAttribute("lastname",user.getLname());
        model.addAttribute("dob",user.getDob());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("password",user.getPassword());
        model.addAttribute("Gender",user.getGender());
        return "Welcome";
    }
}
