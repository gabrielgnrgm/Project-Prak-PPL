package Aplikasi;
import java.util.Date;

public class Jadwal {
  private int id;
  private Date date;
  public enum Day {
    Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu
  }
  
  public void change_jadwal(Date newDate){
      this.date = newDate;
  }
}