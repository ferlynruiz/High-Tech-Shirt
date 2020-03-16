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
public class Body{
    
    public String Heart;
    public int Body_temp;

    //Get methods provide access to the value a variable holds
    public String getbeat() {
        return Heart;
    }
    //Set methods assign values to the variables of the objects
    public void setbeat(String Heart) {
        this.Heart = Heart;
    }
    

    public int gettemp() {
        return Body_temp;
    }

    public void settemp(int Body_temp) {
        this.Body_temp = Body_temp;
    }
}
