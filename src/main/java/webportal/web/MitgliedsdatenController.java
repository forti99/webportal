package webportal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MitgliedsdatenController {
    @GetMapping("/mitgliedsdaten")
    public String angebote() {
        return "mitgliedsdaten";
    }
}