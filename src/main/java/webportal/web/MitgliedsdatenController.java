package webportal.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import webportal.business.MitgliedService;
import webportal.data.entity.Mitglied;

import java.util.List;

@Controller
public class MitgliedsdatenController {

    private final MitgliedService mitgliedService;

    public MitgliedsdatenController(MitgliedService mitgliedService) {
        this.mitgliedService = mitgliedService;
    }

    @GetMapping("/mitgliedsdaten")
    public String angebote() {
        return "mitgliedsdaten";
    }

    @GetMapping("/mitgliedsdaten/abrufenNachId/{mitgliedId}")
    public ResponseEntity<Mitglied> getMitgliedById(@PathVariable Long mitgliedId) {
        return new ResponseEntity<>(mitgliedService.getMitgliedById(mitgliedId), HttpStatus.OK);
    }

    @GetMapping("/mitgliedsdaten/alleAbrufen")
    public ResponseEntity<List<Mitglied>> getAllMitglieder() {
        return new ResponseEntity<>(mitgliedService.getAllMitglieder(), HttpStatus.OK);
    }
}