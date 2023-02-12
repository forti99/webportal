package webportal.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import webportal.business.MitgliederverwaltungService;
import webportal.data.entity.Mitglied;

import java.util.List;

@CrossOrigin
@Controller
public class DatenuebersichtController {

    private final MitgliederverwaltungService mitgliedService;

    public DatenuebersichtController(MitgliederverwaltungService mitgliedService) {
        this.mitgliedService = mitgliedService;
    }

    @GetMapping("/datenuebersicht")
    public String angebote() {
        return "datenuebersicht";
    }

    @GetMapping("/datenuebersicht/alleAbrufen")
    public ResponseEntity<List<Mitglied>> getAllMitglieder() {
        return new ResponseEntity<>(mitgliedService.getAllMitglieder(), HttpStatus.OK);
    }
}