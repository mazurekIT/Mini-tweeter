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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TweetRepository tweetRepository;

    //---------------------------------------------------------------------------
    //---dodaj
    //---------------------------------------------------------------------------
    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "add/adduser";
    }

    @PostMapping("/add")
    public String saveUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add/add";
        }
        userRepository.save(user);
        return "redirect:/user/all";
    }

    //---------------------------------------------------------------------------
    //---pokaż wszystkie
    //---------------------------------------------------------------------------
    @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("size", userRepository.findAll().size());
        return "list/userList";
    }


    //---------------------------------------------------------------------------
    //---potwierdzenie usuwania
    //---------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userRepository.delete(id);
        return "redirect:/user/all";
    }

    @GetMapping("/confirm/{id}")
    public String confirm(Model model, @PathVariable Long id) {
        model.addAttribute("id", id);
        return "form/confirmuser";
    }

    //---------------------------------------------------------------------------
    //---edycja
    //---------------------------------------------------------------------------
    @GetMapping("/updateuser/{id}")
    public String updateUser(Model model, @PathVariable long id) {
        model.addAttribute("user", userRepository.findOne(id));
        return "form/updateUser";
    }

    @PostMapping("/updateuser/{id}")
    public String updateUser(@Valid User user, BindingResult result) {
        userRepository.save(user);
        return "redirect:/user/all";
    }

    //---------------------------------------------------------------------------
    //---listy przekazywane do widoków
    //---------------------------------------------------------------------------
    @ModelAttribute("tweets")
    public List<Tweet> tweets() {
        return tweetRepository.findAll();
    }


}
