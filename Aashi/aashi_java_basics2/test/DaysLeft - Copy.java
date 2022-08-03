package test;
import java.util.Scanner;



public class DaysLeft {
    private static int Total_days = 365;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter today's date: ");
        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int currentDays = absoluteDay(date, month);
        System.out.println("Today is " + date + "/" + month + "/2022, day #" + currentDays + " of the year");

        System.out.print("Please enter person birthday: ");
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int birthDayDays = absoluteDay(j, k);
        int nextBirthdays =
                birthDayDays-currentDays >= 0 ? birthDayDays-currentDays: Total_days - (currentDays-birthDayDays);
        System.out.println(j + "/" + k + "/2022. Your birthday is in "
                + nextBirthdays + " day(s)");

        

        
    }

    private static int absoluteDay(int month, int day){
        int[] days = {0, 0, 31, 60, 91, 121, 91, 121, 152, 182,
        213, 244, 274, 305, 335};
        return days[month] + day;
    }}
