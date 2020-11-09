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
    private int id_psikiater;
    private String nama;
    private String alamat;
    
    public Psikiater(int id, String fullname, String address){
        this.id_psikiater = id;
        this.nama = fullname;
        this.alamat = address;
    }
    
    public String getFullname() {
        return nama;
    }
    
    public String getAddress(){
        return alamat;
    }
    
    public void setAddress(String address){
        this.alamat = address;
    }
}
