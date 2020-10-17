package ca.aretex.irex.cockpit.controllers;

import ca.aretex.irex.cockpit.beans.Trust;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerServices {

    @PostMapping("/accelerate")
    void increase(@RequestBody Trust trust){

    }

    
}
