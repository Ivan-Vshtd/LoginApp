package net.veshtdivn.springsecurityapp.validator;

import net.veshtdivn.springsecurityapp.model.User;
import net.veshtdivn.springsecurityapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by user on 05.10.2016.
 */
@Component
public class UserValidator implements Validator{
    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username", "Required");
        if(user.getUsername().length() < 8 || user.getUsername().length() > 32)
        {
            errors.rejectValue("username","Size.loginForm.username");
        }
        if(userService.findByUsername(user.getUsername())!=null)
        {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","Required");
        if(user.getPassword().length() < 8 || user.getPassword().length() > 32)
        {
            errors.rejectValue("password", "Size.userForm.password");
        }
        if(!user.getConfirmPassword().equals(user.getPassword()))
        {
            errors.rejectValue("confirmPassword","Different.userForm.password");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email", "Required");
        if(!user.getEmail().matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
        {
            errors.rejectValue("email", "Size.userForm.email");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstname", "Required");
        if(!user.getFirstname().matches("\\w+"))
        {
            errors.rejectValue("firstname", "Not.literals.value");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"surename", "Required");
        if(!user.getSurename().matches("\\w+"))
        {
            errors.rejectValue("surename", "Not.literals.value");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"phone", "Required");
        if(!user.getPhone().matches("[0-9]+"))
        {
            errors.rejectValue("phone", "Not.numeric.value");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"city", "Required");
        if(!user.getCity().matches("\\w+"))
        {
            errors.rejectValue("city", "Not.literals.value");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"street", "Required");
        if(!user.getStreet().matches("\\w+\\d*"))
        {
            errors.rejectValue("street", "Size.userForm.data");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"home", "Required");
        if(!user.getHome().matches("\\w+\\d+")) {
            errors.rejectValue("home", "Size.userForm.data");
        }
    }
}
