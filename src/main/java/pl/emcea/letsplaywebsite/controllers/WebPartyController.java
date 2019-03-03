package pl.emcea.letsplaywebsite.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.emcea.letsplaywebsite.models.Greeting;
import pl.emcea.letsplaywebsite.models.Pool;
import pl.emcea.letsplaywebsite.repositories.PoolRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Controller
public class WebPartyController {

    PoolRepository poolRepository;

    public WebPartyController(PoolRepository poolRepository) {
        this.poolRepository = poolRepository;
    }

    @RequestMapping({"", "/", "/home"})
    public String homePage(Model model) {
        model.addAttribute("pool", poolRepository.findByEndDateIsNull());
        return "homePage";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "aboutPage";
    }

    @GetMapping("/basket")
    public String basketPage(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "basketPage";
    }

    @PostMapping("/basket")
    public String basketSubmitPage(@ModelAttribute Greeting greeting) {
        return "basketPage";
    }

    @GetMapping("/pools")
    public String pools(Model model) {
        List<Pool> pools = poolRepository.findByOrderByStartDateDesc();
        model.addAttribute("pools", pools);
        return "pools";
    }


    @PostMapping("/vote/{id}")
    public String vote(@PathVariable String id,  @RequestParam("vote") String vote) {
        poolRepository.updateUserSetStatusForName(Integer.valueOf(vote));
        System.out.println("Głos oddany na: " + id);
        System.out.println("Głos oddany na vote: " + vote);
        return "redirect:/pools";
    }

    @GetMapping("/login")
    public String login() {
        return "/loginPage";
    }

    @GetMapping("/register")
    public String register() {
        return "/registerPage";
    }
}
