package webportal.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import webportal.business.RechnerService;

@Controller
public class RechnerController {

    private final RechnerService rechnerService;

    public RechnerController(RechnerService rechnerService) {
        this.rechnerService = rechnerService;
    }

    @GetMapping("/rechner")
    public String angebote() {
        return "rechner";
    }

    @GetMapping("/rechner/{alter}/{beitrag}/{eintrittsalter}")
    public ResponseEntity<Double> renteBerechnen(@PathVariable int alter, @PathVariable Long beitrag, @PathVariable int eintrittsalter) {
        return new ResponseEntity<>(rechnerService.renteBerechnen(alter, beitrag, eintrittsalter), HttpStatus.OK);
    }
}
