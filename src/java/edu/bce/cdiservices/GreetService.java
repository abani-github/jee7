/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bce.cdiservices;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author behera
 */
@Named
@RequestScoped
public class GreetService {
    
    @Inject Logger logger;
    
    public String greet(){
        logger.info("Hallo from logger");
        return "Hallo User";
    }
    
}
