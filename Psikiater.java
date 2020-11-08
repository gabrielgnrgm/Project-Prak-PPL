/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

/**
 *
 * @author USER
 */
public class Psikiater {
    private int id;
    private String fullname;
    private String address;
    public Psikiater(int id, String fullname, String address){
        this.id = id;
        this.fullname = fullname;
        this.address = address;
    }
    
    public int getId(){
        return id;
    }
    
    public String getFullname() {
        return fullname;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}
