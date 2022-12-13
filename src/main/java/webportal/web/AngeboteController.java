package webportal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngeboteController {
    @GetMapping("/angebote")
    public String angebote() {
        return "angebote";
    }
}