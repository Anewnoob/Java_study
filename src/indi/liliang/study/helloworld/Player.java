package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//玩家类
public class Player {
	public int id;
	public String name;
	public List<String> cards;
	
	//带参数的构造函数
	public Player(int id,String name){
		this.id=id;
		this.name=name;
		this.cards = new ArrayList<String>();
	}
	
	//获取手中最大的一张牌
	public String getMaxNumber(){
		Collections.sort(cards);
		String max = cards.get(0);
		return max;
	}
}
