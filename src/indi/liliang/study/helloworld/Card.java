package indi.liliang.study.helloworld;

import java.util.List;
import java.util.Random;


//4-���ң�3-���ң�2-÷����1-����  23456789 10 JQKA
public class Card {
	public String number[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	public String intcolor[]={"4","3","2","1"};
	
	public List<String> cards;
	public Card(){
		
	}
	
	//��ȡ��ɫ
	public String getColor(){
		String ic;
		Random random = new Random();
		ic=intcolor[random.nextInt(3)];
		return ic;
	} 
	//��ȡ��С
	public String getNumber(){
		String nb;
		Random random = new Random();
		nb = number[random.nextInt(12)];
		return nb;
	}
	//���һ���ƣ�����List����
	public void getOneCard(Player p1,Player p2,Player p){
		//�жϻ�õ����Ƿ��������ϣ��ڵĻ����»�ȡ
		String card;
		do {
			card = getNumber()+getColor();
		} while (p1.cards.contains(card)||p2.cards.contains(card));
		if(!p.cards.add(card)){
			System.out.println("δ�ܳɹ���һ���Ʒ���������У�");
		}
	}
}
