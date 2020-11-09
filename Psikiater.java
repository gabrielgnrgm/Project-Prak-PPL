package Aplikasi;
public class Psikiater extends User{
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
