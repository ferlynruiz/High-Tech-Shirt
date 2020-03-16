/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package high.tech.shirt;

import java.util.Scanner;

/**
 *
 * @author Ferlyn Ruiz
 */
public class HIGHTECHSHIRT {

    public static void main(String[] args) {
        
        Heartbeat_recorder hr=new Heartbeat_recorder();
        Body hb=new Body();
        
        hb.setbeat("120 AMP");        
        hr.record(hb);
        
        Small_LED_screen screen=new Small_LED_screen();
        screen.display(hr.getrecordedHeartbeat().getbeat());
        
        Temperature_sensor ts=new Temperature_sensor();
        hb.settemp(36);        
        ts.detect(hb);


        Warm_temp wt= new Warm_temp();
        Cool_temp ct= new Cool_temp();
        
        if(hb.Body_temp>=0&&hb.Body_temp<=36)
        {
            wt.heatup(ts.getdetectedTemp().gettemp());
        }
        else if (hb.Body_temp>=38&&hb.Body_temp<=50)
        {
            ct.cooldown(ts.getdetectedTemp().gettemp());
        }
    }
}
