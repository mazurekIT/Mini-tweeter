package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;
import pl.coderslab.repository.TweetRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/tweet")
public class TweetController {
    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;
    //---------------------------------------------------------------------------
    //---dodaj 
    //---------------------------------------------------------------------------
    @GetMapping("/add")
    public String addTweet(Model model) {
        model.addAttribute("tweet", new Tweet());
        return "add/addtweet";
    }

    @PostMapping("/add")
    public String saveTweet(@Valid Tweet tweet, BindingResult result) {
        if (result.hasErrors()) {
            return "add/add";
        }
        tweetRepository.save(tweet);
        return "redirect:/tweet/all";
    }

    //---------------------------------------------------------------------------
    //---pokaż wszystkie
    //---------------------------------------------------------------------------
    @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("tweets", tweetRepository.findAll());
        model.addAttribute("size", tweetRepository.findAll().size());
        return "list/tweetList";
    }

    //---------------------------------------------------------------------------
    //---listy przekazywane do widoków
    //---------------------------------------------------------------------------
    @ModelAttribute("users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @ModelAttribute("size")
    public Integer usersSize() {
        return userRepository.findAll().size();
    }



}
