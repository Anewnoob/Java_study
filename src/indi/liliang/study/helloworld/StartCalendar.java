package indi.liliang.study.helloworld;

import java.util.Calendar;
import java.util.Date;


public class StartCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;  //û��0�£�����Ҫ��һ
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("ʹ��Calendar���ʾʱ�䣺"+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
		//Calendar �������getTime()ת��ΪDate����
		Date date = c.getTime();
		Long time = c.getTimeInMillis();  //��ʱ��ȫ��ת��Ϊ����
		System.out.println("Date���ʾʱ�䣺"+date);
		System.out.println("��ǰ��������"+time);
	}

}
