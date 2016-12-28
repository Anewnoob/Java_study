package indi.liliang.study.helloworld;

import java.util.Scanner;

public class CardGame {
	//开始游戏
	public void start(){
		//创建一副新牌
		Card c1 = new Card();
		//创建两个玩家
		Scanner console = new Scanner(System.in);
		System.out.println("请输入玩家1 ID：");
		int id = console.nextInt();
		System.out.println("请输入玩家1 姓名：");
		String name = console.next();
		Player p1 = new Player(id, name);
		System.out.println("请输入玩家2 ID：");
		id = console.nextInt();
		System.out.println("请输入玩家2 姓名：");
		name = console.next();
		Player p2 = new Player(id, name);
		System.out.println("----------------开始游戏--------------");
		System.out.println("----玩家1摸牌----");
		c1.getOneCard(p1,p2,p1);
		System.out.println("----玩家2摸牌----");
		c1.getOneCard(p1,p2,p2);
		System.out.println("----玩家1摸牌----");
		c1.getOneCard(p1,p2,p1);
		System.out.println("----玩家2摸牌----");
		c1.getOneCard(p1,p2,p2);
		compare(p1, p2);
	}
	//比较大小
	public void compare(Player p1,Player p2){
		String p1max = p1.getMaxNumber();
		String p2max = p2.getMaxNumber();
		if(p1max.compareTo(p2max)>0){
			System.err.println("玩家一获胜！");

		}else {
			System.out.println("玩家二获胜！");
			
		}
		System.out.println("------------显示结果-----------");
		char number = p1max.charAt(0);
		char intcolor  = p1max.charAt(1);
		String color;
		if(intcolor=='4'){
			color = "黑桃";
		}else if (intcolor=='3') {
			color = "红桃";
		}else if (intcolor=='2') {
			color = "梅花";
		}else {
			color = "方块";
		}
		System.out.println("玩家一:"+p1.name+"最大的牌：\t颜色："+color+"\t大小："+number);
		char number2 = p2max.charAt(0);
		char intcolor2  = p2max.charAt(1);
		String color2;
		if(intcolor2=='4'){
			color2 = "黑桃";
		}else if (intcolor=='3') {
			color2 = "红桃";
		}else if (intcolor=='2') {
			color2 = "梅花";
		}else {
			color2 = "方块";
		}
		System.out.println("玩家二:"+p2.name+"最大的牌：\t颜色："+color2+"\t大小："+number2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardGame g1 = new CardGame();
		g1.start();
	}

}
