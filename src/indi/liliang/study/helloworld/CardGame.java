package indi.liliang.study.helloworld;

import java.util.Scanner;

public class CardGame {
	//��ʼ��Ϸ
	public void start(){
		//����һ������
		Card c1 = new Card();
		//�����������
		Scanner console = new Scanner(System.in);
		System.out.println("���������1 ID��");
		int id = console.nextInt();
		System.out.println("���������1 ������");
		String name = console.next();
		Player p1 = new Player(id, name);
		System.out.println("���������2 ID��");
		id = console.nextInt();
		System.out.println("���������2 ������");
		name = console.next();
		Player p2 = new Player(id, name);
		System.out.println("----------------��ʼ��Ϸ--------------");
		System.out.println("----���1����----");
		c1.getOneCard(p1,p2,p1);
		System.out.println("----���2����----");
		c1.getOneCard(p1,p2,p2);
		System.out.println("----���1����----");
		c1.getOneCard(p1,p2,p1);
		System.out.println("----���2����----");
		c1.getOneCard(p1,p2,p2);
		compare(p1, p2);
	}
	//�Ƚϴ�С
	public void compare(Player p1,Player p2){
		String p1max = p1.getMaxNumber();
		String p2max = p2.getMaxNumber();
		if(p1max.compareTo(p2max)>0){
			System.err.println("���һ��ʤ��");

		}else {
			System.out.println("��Ҷ���ʤ��");
			
		}
		System.out.println("------------��ʾ���-----------");
		char number = p1max.charAt(0);
		char intcolor  = p1max.charAt(1);
		String color;
		if(intcolor=='4'){
			color = "����";
		}else if (intcolor=='3') {
			color = "����";
		}else if (intcolor=='2') {
			color = "÷��";
		}else {
			color = "����";
		}
		System.out.println("���һ:"+p1.name+"�����ƣ�\t��ɫ��"+color+"\t��С��"+number);
		char number2 = p2max.charAt(0);
		char intcolor2  = p2max.charAt(1);
		String color2;
		if(intcolor2=='4'){
			color2 = "����";
		}else if (intcolor=='3') {
			color2 = "����";
		}else if (intcolor=='2') {
			color2 = "÷��";
		}else {
			color2 = "����";
		}
		System.out.println("��Ҷ�:"+p2.name+"�����ƣ�\t��ɫ��"+color2+"\t��С��"+number2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardGame g1 = new CardGame();
		g1.start();
	}

}
