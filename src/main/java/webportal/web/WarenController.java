package webportal.web;

import webportal.business.WareService;
import webportal.data.entity.Ware;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class WarenController {

    private final WareService wareService;

    public WarenController(WareService wareService) {
        this.wareService = wareService;
    }

    @GetMapping("/waren")
    public String angebote() {
        return "waren";
    }

    @PostMapping("/waren/anbieten")
    public ResponseEntity<Ware> createWare(@RequestBody Ware ware) {
        wareService.saveWare(ware);
        return new ResponseEntity<>(ware, HttpStatus.CREATED);
    }

    @GetMapping("/waren/abrufen")
    public ResponseEntity<List<Ware>> getAllWare() {
        return new ResponseEntity<>(wareService.getAllWare(), HttpStatus.OK);
    }
}








