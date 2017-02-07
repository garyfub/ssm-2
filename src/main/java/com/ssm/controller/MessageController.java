package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/2/7.
 */

@Controller
@RequestMapping("/message")
public class MessageController {

 /*   @RequestMapping(value = "/testFreemaker", method = RequestMethod.GET)
    public ModelAndView  showMessage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("test");
        view.addObject("message", "Say hi for Freemarker.");
        return view;
    }*/

}
