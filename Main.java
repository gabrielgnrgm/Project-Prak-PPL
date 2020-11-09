package Aplikasi;
public class Main {

    public static Pasien[] loadDataPasien(String path){
        File file=new File(path);
        Pasien[] pasien=new Pasien[10];

        Scanner inStream;
        
      //Parse Csv to java: 
        try{
            inStream = new Scanner(file);
 
            int LNidx=0;
            
         while(inStream.hasNext()){// per satu baris
                String line= inStream.next();
                String[] val=line.split(",");
                

                    //9 indexes: (id,Nama,Email) (username,password,role) (Gender,NIK, Alamat)
                        int id=Integer.parseInt(val[0]);
                        String nama=val[1];
                        String email=val[2];
                        
                        String username=val[3];
                        String password=val[4];
                        //String role=val[5];
                        String gender=val[6];
                        int nik=Integer.parseInt(val[7]);
                        String alamat=val[8];
                        
                   
                        //(String nama,int nik,String alamat,String jenis_kelamin     
                        pasien[LNidx]=new Pasien(nama,nik,alamat,gender);
                        pasien[LNidx].setAccount(id,email, username, password,"Pasien");
                        LNidx++;  
 
        }

         inStream.close();
         System.out.println("Data pasien berhasil dimasukkan");
         return pasien;
         
        
     }catch(FileNotFoundException e){
     return null;}

    }
    
    public static void login(String username,String password,Pasien[] data){
        String output="";
        boolean verified=false;
        for(Pasien account:data){
            verified=account.loginWithUsername(username, password);
            if(verified){
                output=("Login Berhasil");
                break;
            }
            
        }
        if(!verified){
            output="Password atau Username Salah";
        }
        System.out.println(output);
        
    }
    
    public static void main(String[] args) {
        Pasien[] pasien=new Pasien[10];
        pasien=loadDataPasien("Pasien.csv");
        
        Psikiater[] psikiater=new Psikiater[5];
        
        //Main
        String user;
        String password;
        
        Scanner in=new Scanner(System.in);
        System.out.println("Login");
        System.out.println("UserName:");
        user=in.nextLine();
        System.out.println("Password");
        password=in.nextLine();
    }
    
}
