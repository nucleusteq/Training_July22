package com.nuc;
import java.time.*;
public class Javac1 {


	public static void main(String args[])
	{
	LocalDate LD = LocalDate.of(2022, 19,11);
	LocalDate CD = LocalDate.now();
	Period p1 = Period.between(LD, CD);
	System.out.printf("Your age is %d years %d months and %d days.", p1.getYears(), p1.getMonths(), p1.getDays());
	}
	}

