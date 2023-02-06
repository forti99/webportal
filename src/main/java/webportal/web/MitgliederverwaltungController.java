package webportal.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import webportal.business.MitgliederverwaltungService;
import webportal.data.entity.Mitglied;

@Controller
public class MitgliederverwaltungController {

    private final MitgliederverwaltungService mitgliederverwaltungService;

    public MitgliederverwaltungController(MitgliederverwaltungService mitgliederverwaltungService) {
        this.mitgliederverwaltungService = mitgliederverwaltungService;
    }

    @GetMapping("/mitgliederverwaltung")
    public String mitglieder() {
        return "mitgliederverwaltung";
    }

    @PostMapping("/mitgliederverwaltung/registrieren")
    public ResponseEntity<Mitglied> createMitglied(@RequestBody Mitglied mitglied) {
        mitgliederverwaltungService.saveMitglied(mitglied);
        return new ResponseEntity<>(mitglied, HttpStatus.CREATED);
    }

    @GetMapping("/mitgliederverwaltung/abrufenNachId/{id}")
    public ResponseEntity<Mitglied> getMitgliedById(@PathVariable Long id) {
        return new ResponseEntity<>(mitgliederverwaltungService.getMitgliedById(id), HttpStatus.OK);
    }

    @PostMapping("/mitgliederverwaltung/loeschenNachId/{id}")
    public void deleteMitgliedById(@PathVariable Long id) {
        mitgliederverwaltungService.deleteMitgliedById(id);
    }
}








