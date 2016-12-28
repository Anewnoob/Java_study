package indi.liliang.study.helloworld;

public class CellPhone extends Telphone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘打电话");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘发短信");
	}

}
