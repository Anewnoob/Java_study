package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Collections.sort(List);

public class CollectionsTest {
	
//��Integer���͵�List��������
	public void testSort1(){
		List<Integer> integers = new ArrayList<Integer>();
		Random random = new Random();
		Integer number;
		for(int i = 0 ;i<10;i++){
			do {
				 number = random.nextInt(100);
			} while (integers.contains(number));
			if(integers.add(number)){
				System.out.println("�ɹ��������"+number);
			}
		}
		System.out.println("---------------Integer����ǰ--------------");
		for (Integer integer : integers) {
			System.out.println("������"+integer);
		}
		Collections.sort(integers);
		System.out.println("---------------Integer�����--------------");
		for (Integer integer : integers) {
			System.out.println("������"+integer);
		}
	}
	
//��String���͵�List��������
	public void testSort2(){
		List<String> strings = new ArrayList<String>();
		strings.add("microsoft");
		strings.add("google");
		strings.add("lenovol");
		System.out.println("-------------String����ǰ----------------");
		for (String string : strings) {
			System.out.println("�ַ�����"+string);
		}
		Collections.sort(strings);
		System.out.println("------------------String�����-------------");
		for (String string : strings) {
			System.out.println("�ַ���:"+string);
		}
	}

//��ϰ��:����10������С�ڵ���10������ַ������ַ�������һ��������List,����
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
		System.out.println("--------------------����ǰ---------------------");
		for (String string2 : strings) {
			System.out.println("�ַ�����"+string2);
		}
		System.out.println("------------�����----------------");
		Collections.sort(strings);
		for (String string2 : strings) {
			System.out.println("�ַ�����"+string2);
		}
	}

//��Student������Ҫʵ��comparable�ӿڣ�������ʵ��compareto������������뱨��
	
	
//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		ct.testSort1();
		ct.testSort2();
		ct.testSort3();
	}

}
