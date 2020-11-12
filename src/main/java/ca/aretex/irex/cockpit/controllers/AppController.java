package ca.aretex.irex.cockpit.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api( value = "Classe créé comme Controlleur générale")
@Controller
public class AppController {

    @ApiOperation(value = "Méthode d'accueil pour l'URI par defaut")
    @RequestMapping(value = {"/"}, method = RequestMethod.POST)
    public void Welcome(){
        System.out.println("Bienvenu dans le service de gestion du Lacet");
    }
}
