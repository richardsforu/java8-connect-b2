package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class C1 {
	
	public static void main(String[] args) throws ParseException {
		
		
		String date="2021-01-25";
		LocalDate dd=LocalDate.parse(date);
		
		String d2=dd.format(DateTimeFormatter.ofPattern("dd-MMMM-yy"));
		System.out.println(d2);
		
		System.out.println(dd);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
	
		
		
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		LocalDate d1=LocalDate.of(2021, 02, 26);
		System.out.println(d1);
		
		
		
		
		
	}

}
