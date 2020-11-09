package Aplikasi;
import java.util.Date;

public class Pendaftaran {
  private int id;
  private Date date;
  public Pendaftaran(int id, Date date){
    this.id=id;
    this.date=date;
  }
  
  public Date getDate(){
    return date;
  }
  
  public void changeDate(Date newDate){
      this.date = newDate;
  }
}
