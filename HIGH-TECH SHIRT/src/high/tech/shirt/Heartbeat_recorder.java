/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package high.tech.shirt;

/**
 *
 * @author Ferlyn Ruiz
 */
public class Heartbeat_recorder{
    
    private Body recordedHeartbeat;
    
    public void record(Body heart){
        recordedHeartbeat=heart;
    }

    public Body getrecordedHeartbeat() {
        return recordedHeartbeat;
    }
}
