package Assesment;

import java.util.*;
import java.time.*;

public class AssesmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dob = LocalDate.of(1997, 06,06);
		LocalDate curDate = LocalDate.now();
		Period period = Period.between(dob, curDate);
		System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
		
	}

	/*public static int absoluteDay(int z, int y) {
	    if (z == 1)
	        return y;
	    if (z == 2)
	        return y + 31;
	    if (z == 3)
	        return y + 60;
	    if (z == 4)
	        return y + 91;
	    if (z == 5)
	        return y + 121;
	    if (z == 6)
	        return y + 152;
	    if (z == 7)
	        return y + 182;
	    if (z == 8)
	        return y + 213;
	    if (z == 9)
	        return y + 244;
	    if (z == 10)
	        return y + 274;
	    if (z == 11)
	        return y + 305;
	    if (z == 12)
	        return y + 335;
	    else
	        return 0;
	}

	public static int absoluteDaytwo(int q, int w) {
	    if (q == 1)
	        return w;
	    if (q == 2)
	        return w + 31;
	    if (q == 3)
	        return w + 60;
	    if (q == 4)
	        return w + 91;
	    if (q == 5)
	        return w + 121;
	    if (q == 6)
	        return w + 152;
	    if (q == 7)
	        return w + 182;
	    if (q == 8)
	        return w + 213;
	    if (q == 9)
	        return w + 244;
	    if (q == 10)
	        return w + 274;
	    if (q == 11)
	        return w + 305;
	    if (q == 12)
	        return w + 335;
	    else
	        return 0;
	}

	public static int absoluteDaythree(int j, int k) {
	    if (j == 1)
	        return k;
	    if (j == 2)
	        return k + 31;
	    if (j == 3)
	        return k + 60;
	    if (j == 4)
	        return k + 91;
	    if (j == 5)
	        return k + 121;
	    if (j == 6)
	        return k + 152;
	    if (j == 7)
	        return k + 182;
	    if (j == 8)
	        return k + 213;
	    if (j == 9)
	        return k + 244;
	    if (j == 10)
	        return k + 274;
	    if (j == 11)
	        return k + 305;
	    if (j == 12)
	        return k + 335;
	    else
	        return 0;
	}*/

}
