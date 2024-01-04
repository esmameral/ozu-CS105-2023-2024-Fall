package com.ozu.model.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String convertDateToString(Date date) {
		
		String pattern="dd.MM.yyyy HH:mm";
		SimpleDateFormat df=new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
}
