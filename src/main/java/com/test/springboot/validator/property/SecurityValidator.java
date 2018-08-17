package com.test.springboot.validator.property;


import com.test.springboot.config.AppConfig;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SecurityValidator implements Validator {


    @Override
    public boolean supports(Class<?> type) {
        return type == AppConfig.Security.class;
    }

    @Override
    public void validate(Object o, Errors errors) {

        String username = ((AppConfig.Security) o).getUsername();
        if("invalidUserName".equals(username)) {
            errors.rejectValue(username, "Invalid username");
        }
    }
}
