package webportal.web;

import webportal.business.MitgliedService;
import webportal.data.entity.Mitglied;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class MitgliedController {

    private final MitgliedService mitgliedService;

    public MitgliedController(MitgliedService mitgliedService) {
        this.mitgliedService = mitgliedService;
    }

    @GetMapping("/mitglieder")
    public String mitglieder() {
        return "mitglieder";
    }

    @PostMapping("/mitglied/registrieren")
    public ResponseEntity<Mitglied> createMitglied(@RequestBody Mitglied mitglied) {
        mitgliedService.saveMitglied(mitglied);
        return new ResponseEntity<>(mitglied, HttpStatus.CREATED);
    }

    @GetMapping("/mitglied/abrufen")
    public ResponseEntity<List<Mitglied>> getAllMitglieder() {
        return new ResponseEntity<>(mitgliedService.getAllMitglieder(), HttpStatus.OK);
    }
}







