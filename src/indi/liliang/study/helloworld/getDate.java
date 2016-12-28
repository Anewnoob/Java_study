package indi.liliang.study.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getDate{



	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		//将时间转换为自定义格式
		SimpleDateFormat time1 = new SimpleDateFormat("yyyy.mm.dd HH:MM:SS");
		String aString = time1.format(d);
 		System.out.println(aString);
 		
 		//parse()将文本时间转化为日期
 		String str = "2016年11月26日 15:11:32";
 		SimpleDateFormat time2 = new SimpleDateFormat("yyyy年mm月dd日 hh:mm:ss");
 		
 		Date date = time2.parse(str);
 		System.out.println(date);
	}

}
