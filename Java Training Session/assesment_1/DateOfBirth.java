import java.time.*;  
  
public class DateOfBirth  
{    
public static void main(String args[])  
{  
  
LocalDate dob = LocalDate.of(2022, 7,01);  

LocalDate curDate = LocalDate.now();  

Period period = Period.between(dob, curDate);  

System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
}  
}  