package Aplikasi;

public class Pasien extends User {
    private int nik;
    private String nama;
    private String alamat;
    
    enum Kelamin{
        Laki,Perempuan
    };
    Kelamin kelamin;
  
    //id,nama,email username,password,role gender,nik,alamat
    public Pasien(String nama,int nik,String alamat,String jenis_kelamin){
       //Pasien
       this.nik=nik;
       this.nama=nama;
       if(jenis_kelamin.equals("L")){
           kelamin=Kelamin.Laki;
       }
       else{
           kelamin=Kelamin.Perempuan;
       }
       this.alamat=alamat;
       
    }
//set Method  
    public void setAddress(String address){
        this.alamat = address;
    }

//get Method    
    public int getNik(){
        return nik;
    }
    
    public String getNama(){
       return nama; 
    }
    public String getJenisKelamin(){
       if (kelamin.equals(Kelamin.Laki)){
        return "Laki-laki" ; 
       }
       else{
        return "Perempuan" ;  
       } 
    }
    
    public String getAlamat(){
       return alamat; 
    }
    
}
