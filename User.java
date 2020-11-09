public class User {
  protected int user_id;
  protected String email, username, password;
  protected enum Role {
    Pasien, Psikiater, Administrator
  }
  Role role;
  
  /*
  public User(int id, String email, String username, String password, String role){
    this.user_id=id;
    this.username=username;
    this.password=password;
    //this.role=role;
  }
   */

  public boolean loginWithUsername(String username, String password){
    if(username.equals(this.username) && password.equals(this.password)){
      return true;
    }
    else{
      return false;  
    }
  }
  
  public boolean loginWithEmail(String email, String password){
    if(email.equals(this.email) && password.equals(this.password)){
      return true;
    }
    else{
      return false;  
    }
  }
  
  
  public void setAccount(int id, String username, String password){
        this.user_id=id;
        this.username=username;
        this.password=password;
    }
  
  
  public void gantiPassword(String newPass){
        this.password=newPass;
    }
//get Method    
   
    public int getId(){
        return user_id;
    }
  
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    } 
    
    public String getRole(){
      switch (role) {
          case Pasien:
              return "Pasien" ;
          case Psikiater:
              return "Psikiater" ;
          default:
              return "Administrator";
      }
        
    }
}
