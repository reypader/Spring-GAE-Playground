package com.rmpader.projects.gae.spring.greeter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@RestController
public class GreetingController {

    @RequestMapping("/greet")
    public String greet(HttpServletRequest req) {
        UserService userService = UserServiceFactory.getUserService();
        User currentUser = userService.getCurrentUser();

        if (currentUser != null) {
            return "Hello, " + currentUser.getNickname();
        } else {
            return "<a href=\""+userService.createLoginURL(req.getRequestURI())+"\">Sign in</a>";
        }
    }

}
