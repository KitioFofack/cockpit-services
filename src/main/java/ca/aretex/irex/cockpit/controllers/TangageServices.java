package ca.aretex.irex.cockpit.controllers;

import ca.aretex.irex.cockpit.beans.Inclination;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TangageServices {

    @PostMapping("/rotate")
    void rotate(@RequestBody Inclination inclination){

    }
}
