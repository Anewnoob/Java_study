package indi.liliang.study.helloworld;

import java.util.List;
import java.util.Random;


//4-黑桃，3-红桃，2-梅花，1-方块  23456789 10 JQKA
public class Card {
	public String number[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	public String intcolor[]={"4","3","2","1"};
	
	public List<String> cards;
	public Card(){
		
	}
	
	//获取颜色
	public String getColor(){
		String ic;
		Random random = new Random();
		ic=intcolor[random.nextInt(3)];
		return ic;
	} 
	//获取大小
	public String getNumber(){
		String nb;
		Random random = new Random();
		nb = number[random.nextInt(12)];
		return nb;
	}
	//获得一张牌，放入List容器
	public void getOneCard(Player p1,Player p2,Player p){
		//判断获得的牌是否已在手上，在的话重新获取
		String card;
		do {
			card = getNumber()+getColor();
		} while (p1.cards.contains(card)||p2.cards.contains(card));
		if(!p.cards.add(card)){
			System.out.println("未能成功发一张牌放入玩家手中！");
		}
	}
}
