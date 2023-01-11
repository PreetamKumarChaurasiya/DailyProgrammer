import java.time.LocalDate;
import java.time.Month;

public class Imp {
   public static void main(String args[]) {

    
    int birthDate = 30;
    Month birthMonth = Month.DECEMBER;

   
    LocalDate currentDate = LocalDate.now();
    System.out.println("Todays Date: " + currentDate);
    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if(date == birthDate && month == birthMonth) {
      System.out.println("HAPPY BIRTHDAY TO YOU DURGESH SIR  !!");
    }
    else {
      System.out.println("Today is not my birthday.");
    }
   }
}