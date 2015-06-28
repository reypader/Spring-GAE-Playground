package com.rmpader.gae.spring.playground.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlaygroundController {

    @RequestMapping("/")
    public ModelAndView greet() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    /*
     * UserService userService = UserServiceFactory.getUserService(); User
     * currentUser = userService.getCurrentUser();
     * 
     * if (currentUser != null) { return "Hello, " + currentUser.getNickname();
     * } else { return
     * "<a href=\""+userService.createLoginURL(req.getRequestURI(
     * ))+"\">Sign in</a>"; }
     */

}
