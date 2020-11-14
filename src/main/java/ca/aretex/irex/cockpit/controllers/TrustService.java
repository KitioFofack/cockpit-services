package ca.aretex.irex.cockpit.controllers;

import ca.aretex.irex.cockpit.beans.Inclination;
import ca.aretex.irex.cockpit.beans.TrustCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "Decrease the trust")
@Slf4j
@RestController
public class TrustService {

    @ApiOperation(value="Decrease the trust of the motor by the value of the TrustCommand")
    @PostMapping("/decrease")
    void decrease(@RequestBody TrustCommand trustcommand){
        log.info("Command trust", trustcommand);

    }
}
