package pl.coderslab.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dto.LoginDto;
import pl.coderslab.dto.RegistrationDto;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    //---------------------------------------------------------------------------
    //---
    //---------------------------------------------------------------------------
    @GetMapping
    public String registration(Model model) {
        model.addAttribute("registrationDto", new RegistrationDto());
        return "registration/registrationForm";
    }

    @PostMapping
    public String postRegistration(@Valid RegistrationDto registrationDto, BindingResult bindingResult) {
        //czy podane hasła są takie same
        String password = registrationDto.getPassword();
        String passwordRepeat = registrationDto.getPasswordRepeat();
        boolean equals = password.equals(passwordRepeat);

        if (!equals){
            bindingResult.addError(new ObjectError("registrationDto","hasla nie pasuja"));
        }

        //czy nie ma już takiego maila
        User byEmail = userRepository.findByEmail(registrationDto.getEmail());
        if (byEmail!=null){
            bindingResult.addError(new ObjectError("registrationDto","podany email już istnieje"));
        }

        //czy nie ma błędów formularza
        if (bindingResult.hasErrors()) {
            return "registration/registrationForm";
        }


        User user = new User();
        user.setUsernam(registrationDto.getLogin());
        user.setEmail(registrationDto.getEmail());
        user.setHashedPassword(registrationDto.getPassword());
        userRepository.save(user);

        return "redirect:/login";
    }

}
