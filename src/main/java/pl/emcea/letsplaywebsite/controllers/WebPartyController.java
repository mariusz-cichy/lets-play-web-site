package pl.emcea.letsplaywebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.emcea.letsplaywebsite.models.Greeting;

//@Controller
//public class WebPartyController {
//
//    @RequestMapping({"", "/"})
//    public String homePage() {
//        return "homePage";
//    }
//
//    @RequestMapping("/about")
//    public String aboutPage() {
//        return "aboutPage";
//    }
//
//    @GetMapping("/basket")
//    public String basketPage(Model model) {
//        model.addAttribute("greeting", new Greeting());
//        return "basketPage";
//    }
//    @PostMapping("/basket")
//    public String basketSubmitPage(@ModelAttribute Greeting greeting) {
//        return "basketPage";
//    }
//}
