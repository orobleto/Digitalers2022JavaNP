package com.edcuacionit.digitalers.Clase14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import com.edcuacionit.digitalers.utils.utilities.time.DateUtils;

public class AppFechas {
	public static void main(String[] args) {
		// yyyy MM m

		LocalDate localDate = DateUtils.getLocalDate("15 marzo 1983", "dd MMMM yyyy");
		System.out.println(localDate);
		LocalDate localDate2 = LocalDate.parse("2025-03-06");
		System.out.println(DateUtils.getString(localDate2, "dd MMMM yyyy"));

		LocalDateTime localDateTime = DateUtils.getLocalDateTime("1983-03-15 18:05:39.3", "yyyy-MM-dd HH:mm:ss.S");
		System.out.println(localDateTime);
		
		System.out.println(DateUtils.getString(localDateTime, "dd 'de' MMMM 'de' yyyy 'a las' KK:mm:ss a"));

		
		Date date = new Date(120,0,31);
		System.out.println(date);
		
		System.out.println(DateUtils.getLocalDate(date));
		
		System.out.println(DateUtils.getLocalDateTime(date));
		
		
		System.out.println(LocalTime.now());
		
		
	}
}
