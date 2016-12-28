package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Collections.sort(List);

public class CollectionsTest {
	
//对Integer类型的List进行排序
	public void testSort1(){
		List<Integer> integers = new ArrayList<Integer>();
		Random random = new Random();
		Integer number;
		for(int i = 0 ;i<10;i++){
			do {
				 number = random.nextInt(100);
			} while (integers.contains(number));
			if(integers.add(number)){
				System.out.println("成功添加整数"+number);
			}
		}
		System.out.println("---------------Integer排序前--------------");
		for (Integer integer : integers) {
			System.out.println("整数："+integer);
		}
		Collections.sort(integers);
		System.out.println("---------------Integer排序后--------------");
		for (Integer integer : integers) {
			System.out.println("整数："+integer);
		}
	}
	
//对String类型的List进行排序
	public void testSort2(){
		List<String> strings = new ArrayList<String>();
		strings.add("microsoft");
		strings.add("google");
		strings.add("lenovol");
		System.out.println("-------------String排序前----------------");
		for (String string : strings) {
			System.out.println("字符串："+string);
		}
		Collections.sort(strings);
		System.out.println("------------------String排序后-------------");
		for (String string : strings) {
			System.out.println("字符串:"+string);
		}
	}

//练习题:生成10条长度小于等于10的随机字符串，字符串不能一样，放入List,排序
	public void testSort3(){
		List<String> strings = new ArrayList<String>();
		String string  = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rd = new Random();
		int length;
		for(int i = 0; i < 10; i++){
			StringBuffer sb = new StringBuffer();
			length = rd.nextInt(10);
			for(int j = 0;j<length;j++){
				sb.append(string.charAt(rd.nextInt(62)));
			}
			strings.add(sb.toString());
		}
		System.out.println("--------------------排序前---------------------");
		for (String string2 : strings) {
			System.out.println("字符串："+string2);
		}
		System.out.println("------------排序后----------------");
		Collections.sort(strings);
		for (String string2 : strings) {
			System.out.println("字符串："+string2);
		}
	}

//对Student排序需要实现comparable接口，在里面实现compareto方法，否则编译报错。
	
	
//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		ct.testSort1();
		ct.testSort2();
		ct.testSort3();
	}

}
