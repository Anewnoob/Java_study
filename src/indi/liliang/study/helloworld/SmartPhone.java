package indi.liliang.study.helloworld;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("ͨ��������绰");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("ͨ������������");
	}

	@Override
	public void playGame(){
		// TODO Auto-generated method stub
		System.out.println("smartPhoneʵ������Ϸ�Ĺ���");
	}

}
