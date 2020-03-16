/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package high.tech.shirt;

/**
 *
 * @author student
 */
public class Temperature_sensor{
    
private Body detectedTemp;
    
    public void detect(Body body_temp){
        detectedTemp=body_temp;
    }

    public Body getdetectedTemp() {
        return detectedTemp;
    }
}
