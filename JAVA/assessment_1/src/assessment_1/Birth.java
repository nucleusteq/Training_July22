package assessment_1;
import java.time.LocalDate;



import java.time.Period;
public class Birth
{
public static void main(String args[])
{
LocalDate dob = LocalDate.of(1999, 3,07);

LocalDate Date = LocalDate.now();
Period period = Period.between(dob, Date);

System.out.printf("Your age ,year ,month.", period.getYears(), period.getMonths(), period.getDays());
}
}