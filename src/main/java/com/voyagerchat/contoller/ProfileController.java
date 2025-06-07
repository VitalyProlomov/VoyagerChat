package com.voyagerchat.contoller;

import com.voyagerchat.model.User;
import com.voyagerchat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProfileController {
    private final UserRepository userRepository;

    @GetMapping("/profile")
    public String profile(@AuthenticationPrincipal User currentUser, Model model) {
        System.out.println("Current user \nEmail: " + currentUser.getEmail() +
                "\nAccount created: " + currentUser.getDateOfCreated());
        model.addAttribute("user", currentUser);
        return "profile";
    }
}
