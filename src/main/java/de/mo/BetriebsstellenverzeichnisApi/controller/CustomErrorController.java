package de.mo.BetriebsstellenverzeichnisApi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    @ResponseBody
    String error(HttpServletRequest request) {
        return "<div> <h1>Error occurred<h1> <br> <h2>please contact your webmaster if you have questions on how to use this api <h2><div>";
    }

    //@Override
    public String getErrorPath() {
        return "/error";
    }
}

