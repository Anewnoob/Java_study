package indi.liliang.study.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getDate{



	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		//��ʱ��ת��Ϊ�Զ����ʽ
		SimpleDateFormat time1 = new SimpleDateFormat("yyyy.mm.dd HH:MM:SS");
		String aString = time1.format(d);
 		System.out.println(aString);
 		
 		//parse()���ı�ʱ��ת��Ϊ����
 		String str = "2016��11��26�� 15:11:32";
 		SimpleDateFormat time2 = new SimpleDateFormat("yyyy��mm��dd�� hh:mm:ss");
 		
 		Date date = time2.parse(str);
 		System.out.println(date);
	}

}
