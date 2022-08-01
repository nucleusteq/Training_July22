package Assessment;

import java.time.*;
public class Date
{
public static void main(String args[])
{
LocalDate dob = LocalDate.of(1999, 1,21);
LocalDate curDate = LocalDate.now();
Period p= Period.between(dob, curDate);
System.out.printf("Your age is %d years %d months and %d days.", p.getYears(), p.getMonths(), p.getDays());
}
}