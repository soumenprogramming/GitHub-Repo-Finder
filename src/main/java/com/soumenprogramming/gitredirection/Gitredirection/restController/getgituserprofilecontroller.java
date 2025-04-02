package com.soumenprogramming.gitredirection.Gitredirection.restController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class getgituserprofilecontroller {
    @GetMapping("/")
    public String index() {
        return "index";  // Returns index.html
    }

    @GetMapping("/redirect")
    public RedirectView redirectToGitHub(@RequestParam("username") String username) {
        String githubUrl = "https://github.com/" + username;
        return new RedirectView(githubUrl);
    }
}
