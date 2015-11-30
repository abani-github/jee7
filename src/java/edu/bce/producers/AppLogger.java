    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bce.producers;

import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author behera
 */
@Dependent
public class AppLogger {
    @Produces
    public Logger expose(InjectionPoint ip){
        return Logger.getLogger( ip.getMember().getDeclaringClass().getName() );
    }
}
