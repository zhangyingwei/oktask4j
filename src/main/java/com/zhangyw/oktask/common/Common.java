package com.zhangyw.oktask.common;

import java.util.Calendar;

import com.zhangyw.oktask.util.DateUtil;

public class Common {
	public static final Long SYSTEM_TIMESTAMP = DateUtil.getTimestamp();
	public static final int SYSTEM_YEAR = DateUtil.timestamp2Year(SYSTEM_TIMESTAMP);
	public static final int SYSTEM_MONTH = DateUtil.timestamp2Month(SYSTEM_TIMESTAMP);
	public static final int SYSTEM_DAY = DateUtil.timestamp2Day(SYSTEM_TIMESTAMP);
	public static final int SYSTEM_HOUR = DateUtil.timestamp2Hours(SYSTEM_TIMESTAMP);
	public static final int SYSTEM_MINUTE = DateUtil.timestamp2Minutes(SYSTEM_TIMESTAMP);
	public static final int SYSTEM_SECOND = DateUtil.timestamp2Seconds(SYSTEM_TIMESTAMP);
	public static final Integer MILLISECOND_OF_SECOND = 1000;
	public static final Integer MILLISECOND_OF_MINUTE = 60*MILLISECOND_OF_SECOND;
	public static final Integer MILLISECOND_OF_HOUR = 60*MILLISECOND_OF_MINUTE;
	public static final Integer MILLISECOND_OF_DAY = 24*MILLISECOND_OF_HOUR;
	public static final Integer DAYS_OF_MONTH = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
	public static final Integer MONTHS_OF_YEAR = 12;
	public static final Integer DAYS_OF_YEAR = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_YEAR);
}
