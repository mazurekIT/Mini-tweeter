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
@Autowired
private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/home")
    public String home(){
        return "index";
    }


    @GetMapping("/user/{id}/tweets")
    public String showTweet(Model model, @PathVariable long id) {
        List<Tweet> allByUserId = tweetRepository.findAllByUserId(id);
        model.addAttribute("tweets",allByUserId );
        return "form/tweets";
    }


    //---------------------------------------------------------------------------
    //---TODO zrobić przekazanie przez formularz paramu
    //---------------------------------------------------------------------------
    @GetMapping("/user/search-tweets/{param}")
    public String showTweet(Model model,@PathVariable String param) {
        List<Tweet> ab = tweetRepository.findAllByTitleLikePrefix(param);
        model.addAttribute("tweets",ab );
        return "form/getPrefix";
    }






    @ModelAttribute("users")
    public List<User> users() {
        return userRepository.findAll();
    }

}
