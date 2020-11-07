package Aplikasi;

public class Pasien {
    private String nik;
    private String password;
    private String nama;
    private String email;
  
    
    public Pasien(String nama,String nik,String email,String password){
       this.nik=nik;
       this.nama=nama;
       this.email=email;
       this.password=password;
    }
//set Method    
    public void gantiPassword(String newPass){
        this.password=newPass;
    }
    public void gantiEmail(String email){
        this.email=email;
    }
//get Method    
    public String getiD(){
        return nik;
    }
    
    public String getNama(){
       return nama; 
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    } 
    
    
}
