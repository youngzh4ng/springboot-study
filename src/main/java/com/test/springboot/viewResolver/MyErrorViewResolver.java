package com.test.springboot.viewResolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        System.out.println("here?");
        if (HttpStatus.NOT_ACCEPTABLE.equals(status)) {
            ModelAndView view = new ModelAndView();
            view.setViewName("406");
            return view;
        }
        return null;
    }
}
