/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage.restaurant.hcn;

/**
 *
 * @author voquanghuy
 */
public class Control {
    private String Name;
    public Control(String Name){
        this.Name = Name;
    }
    
    public void setName(String Name )
    {
        this.Name = Name;
    }
    
    public String getName()
    {
        return Name;
    }
}
