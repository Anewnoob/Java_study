package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//�����
public class Player {
	public int id;
	public String name;
	public List<String> cards;
	
	//�������Ĺ��캯��
	public Player(int id,String name){
		this.id=id;
		this.name=name;
		this.cards = new ArrayList<String>();
	}
	
	//��ȡ��������һ����
	public String getMaxNumber(){
		Collections.sort(cards);
		String max = cards.get(0);
		return max;
	}
}
