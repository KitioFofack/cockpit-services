package ca.aretex.irex.cockpit.controllers;

import ca.aretex.irex.cockpit.beans.Inclination;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;

@Api( description ="API les mouvements de Lacet de l'avion")
@Slf4j
@RestController
public class LacetServices {


    @ApiOperation(value = "Change l'orientation de l'avion par rapport au Lacet")
    @PostMapping("/rotate")
    void rotate(@RequestBody Inclination inclination){
        log.info("Changement du lacet", inclination);

    }
}
