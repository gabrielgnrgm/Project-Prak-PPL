public class User {
  private int user_id;
  private String email, username, password;
  private enum role {
    Pasien, Psikiater, Administrator
  }
  
  public User(int id, String email, String username, String password, String role){
    this.id=id;
    this.username=username;
    this.password=password;
    this.role=role;
  }

  public void loginWithUsername(String username, String password){
    if(username.equals(this.username) && password.equals(this.password)){
      //Apa ini? Aku bingung?
    }
    else{
     System.out.println("Username atau password salah"); 
    }
  }
  
  public void loginWithEmail(String email, String password){
    if(email.equals(this.email) && password.equals(this.password)){
      //Apa ini? Aku bingung
    }
    else{
     System.out.println("Email atau password salah");  
    } 
  }
}
