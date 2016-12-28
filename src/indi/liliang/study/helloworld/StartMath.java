package indi.liliang.study.helloworld;

//Math类对数进行操作
public class StartMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 12.45;
		System.out.println(Math.round(number));   //4舍5入
		System.out.println(Math.floor(number));		//小于number的最小整数
		System.out.println(Math.ceil(number));		//大于number的最大整数
		System.out.println(Math.random());			//0-1随机
	}

}
