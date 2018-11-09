package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;
import pl.coderslab.repository.TweetRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }


    @RequestMapping("/app/home")
    public String home(Model model){
        return "home";
    }


}
