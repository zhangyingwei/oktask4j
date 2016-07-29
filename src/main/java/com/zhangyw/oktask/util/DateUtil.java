package com.zhangyw.oktask.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date timestamp2Date(Long timestamp){
		return new Date(timestamp);
	}
	public static int timestamp2Year(Long timestamp){
		return timestamp2Date(timestamp).getYear();
	}
	public static int timestamp2Month(Long timestamp){
		return timestamp2Date(timestamp).getMonth();
	}
	public static int timestamp2Day(Long timestamp){
		return timestamp2Date(timestamp).getDay();
	}
	public static int timestamp2Hours(Long timestamp){
		return timestamp2Date(timestamp).getHours();
	}
	public static int timestamp2Minutes(Long timestamp){
		return timestamp2Date(timestamp).getMinutes();
	}
	public static int timestamp2Seconds(Long timestamp){
		return timestamp2Date(timestamp).getSeconds();
	}
	public static Long getTimestamp(){
		return new Date().getTime();
	}
	public static String getCurrentTime(String pattern){
		return new SimpleDateFormat(pattern).format(new Date());
	}
}
