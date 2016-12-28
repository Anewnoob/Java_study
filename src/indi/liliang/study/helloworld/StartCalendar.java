package indi.liliang.study.helloworld;

import java.util.Calendar;
import java.util.Date;


public class StartCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;  //没有0月，所以要加一
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("使用Calendar类表示时间："+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		//Calendar 类对象用getTime()转换为Date对象
		Date date = c.getTime();
		Long time = c.getTimeInMillis();  //将时间全部转换为毫秒
		System.out.println("Date类表示时间："+date);
		System.out.println("当前毫秒数："+time);
	}

}
