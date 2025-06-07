package com.voyagerchat.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class UserRequestsController {
    @GetMapping("/main-page")
    public String mainPage(@RequestParam(name="contentFragment", defaultValue = "chat-fragment") String fragmentValue,
                           Model model) {
        model.addAttribute("contentFragment", fragmentValue);
        return "main-page";
    }

//    @GetMapping("/change-main-fragment")
//    public String updateMainPage(@RequestParam(name="contentFragment", defaultValue = "chat-fragment") String fragmentValue,
//                                 Model model) {
//        if (fragmentValue.equals("chat-fragment")) {
//            model.addAttribute("contentFragment",
//                    "chat-fragment");
//        } else if (fragmentValue.equals("selector-fragment")) {
//            model.addAttribute("contentFragment",
//                    "selector-fragment");
//        }
//        return "main-page";
//    }

//    @PostMapping("/main-page")
//    public String handleRequest(
//            @RequestParam("formType") String formType,
//            Principal principal) {
//
//
//    }

//    @PostMapping
//    public String changeDialog(Model model) {
//
//    }


}
