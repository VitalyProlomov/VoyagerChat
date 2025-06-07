package com.voyagerchat.contoller;

import com.voyagerchat.model.User;
import com.voyagerchat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("registration")
    public String registerNewUser(User user, Model model) {
        boolean wasCreated = userService.createUser(user);
        if (!wasCreated) {
            model.addAttribute("errorMessage", "User with email " + user.getEmail() + " already exists");
            return "registration";
        }
        return "redirect:/login";
    }

//    @PostMapping
//    public String
}
