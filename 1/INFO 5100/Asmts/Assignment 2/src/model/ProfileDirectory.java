/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Yulun Feng
 */
public class ProfileDirectory {
    
    private ArrayList<Profile> profiles;
    
    public ProfileDirectory(){
        this.profiles = new ArrayList<Profile>();
    }
    
    public ArrayList<Profile> getProfile(){
        return profiles;
    }
    
    public void setProfile(ArrayList<Profile> profiles){
        this.profiles = profiles;
    }
    
    public Profile addProfile(){
        Profile p = new Profile();
        profiles.add(p);
        return p;
    }
    
    public void deleteAccount(Profile profile){
        profiles.remove(profile);
    }
    
    public Profile searchByFName(String fName){
        for(Profile profile:profiles){
            if(profile.getFirstName().contains(fName)){
                return profile;
            }
        }
        return null;
    }
    
    public Profile searchByLName(String lName){
        for(Profile profile:profiles){
            if(profile.getLastName().contains(lName)){
                return profile;
            }
        }
        return null;
    }
    
    public Profile searchByStreetAddress(String stAddr){
        for(Profile profile:profiles){
            if(profile.getHomeAddress().getStreetAddress().contains(stAddr)||
               profile.getWorkAddress().getStreetAddress().contains(stAddr)){
               return profile;
            }
        }
        return null;
    }
}
