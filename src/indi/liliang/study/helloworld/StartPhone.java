package indi.liliang.study.helloworld;

public class StartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1 = new CellPhone();
		Telphone tel2 = new SmartPhone();
		tel1.call();
		tel1.sendMessage();
		tel2.call();
		tel2.sendMessage();
		IPlayGame ps1 = new SmartPhone();
		ps1.playGame();
		
		IPlayGame ps2 = new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类实现接口，方法一");
			}
		};
		ps2.playGame();
		
		new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类实现结构，方法二");
			}
			
		}.playGame();
	}

}
