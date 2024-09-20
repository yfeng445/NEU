/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author 56111
 */
public class VitalSignsHistory {
    
    ArrayList<VitalSigns> history;
    
    public VitalSignsHistory(){
    history = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVs = new VitalSigns();
        history.add(newVs);
        return newVs;
    }
    
    public void removeVitalSigns(VitalSigns Vs){
        history.remove(Vs);
    }
    
    public ArrayList<VitalSigns> getHistory(){
        return this.history;
    }
    
}
