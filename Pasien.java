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
public class Pasien {
    String id;
    String password; 
    String nama;
    
    public void gantiPassword(String newPass){
        password=newPass;
    }
}
