package indi.liliang.study.helloworld;

import java.util.Scanner;

public class StartCar {
	private int allNumber=0;
	private float allLoads=0;
	private float allRent=0;
	private String carNamePeple[]=new String[10];
	private String carNameLoads[]=new String[10];

	public static Car car[] = {
	new CarryPepleCar("Aodi_A4", 4, 500),
	new CarryPepleCar("Mazida_6", 4, 400),
	new CarryPepleCar("Jinlong", 20, 800),
	new PiCar("Pikaxue_6", 4, 2, 450),
	new CarryLoadsCar("Songhuajiang", 4, 400),
	new CarryLoadsCar("Yiweike", 20, 1000)
	};
	
	public static void isRentCar(){
		Scanner cin = new Scanner(System.in);
		int choice = cin.nextInt();
		if(choice == 1){}else {
				System.out.println("欢迎下次光临!ByeBye!");
				return;
		 }
	}
	
	public static void showCarList(){
		int count =1;
		System.out.println("您可租车的类型及其价目表：");
		System.out.println("序号\t汽车名称\t租金\t容量");
		for(int i=0;i<car.length;i++,count++){
			if(car[i] instanceof CarryPepleCar){
				System.out.println(count+"."+"\t"+((CarryPepleCar)car[i]).carName+" \t"+((CarryPepleCar)car[i]).rent+"元/天"+"\t"+"载人："+((CarryPepleCar)car[i]).number+"人");
			}
			if(car[i] instanceof CarryLoadsCar){
				System.out.println(count+"."+"\t"+((CarryLoadsCar)car[i]).carName+" \t"+((CarryLoadsCar)car[i]).rent+"元/天"+"\t"+"载货："+((CarryLoadsCar)car[i]).loads);
			}
			if(car[i] instanceof PiCar){
				System.out.println(count+"."+"\t"+((PiCar)car[i]).carName+" \t"+((PiCar)car[i]).rent+"元/天"+"\t"+"载人："+((PiCar)car[i]).number+"人,载货："+((PiCar)car[i]).loads);
			}
		}
	}
	
	public  void getAllRentLoadsNumberName(){
		Scanner cin = new Scanner(System.in);
		int carNumber=cin.nextInt();
		for(int i=0,j=0,k=0;i<carNumber;i++){
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			int order=cin.nextInt();
			order=order-1;
			if(car[order] instanceof CarryPepleCar){
				this.allRent+=((CarryPepleCar)car[order]).rent;
				this.allNumber+=((CarryPepleCar)car[order]).number;
				this.carNamePeple[j++]=((CarryPepleCar)car[order]).carName;
			}
			if(car[order] instanceof CarryLoadsCar){
				this.allRent+=((CarryLoadsCar)car[order]).rent;
				this.allLoads+=((CarryLoadsCar)car[order]).loads;
				this.carNameLoads[k++]=((CarryLoadsCar)car[order]).carName;
			}
			if(car[order] instanceof PiCar){
				this.allRent+=((PiCar)car[order]).rent;
				this.allNumber+=((PiCar)car[order]).number;
				this.allLoads+=((PiCar)car[order]).loads;
				this.carNamePeple[j++]=((PiCar)car[order]).carName;
			}
		}
		System.out.println("请输入租车天数：");
		int days=cin.nextInt();
		this.allRent*=days;
	}

	public void showOrder(){
		System.out.println("您的账单:");
		System.out.println("***可载人的有：");
		for(int i=0;i<carNamePeple.length;i++){
			if(carNamePeple[i]==null) break;
			System.out.print(carNamePeple[i]+" ");
			
		}
		System.out.println();
		System.out.println("***可载货的有：");
		for(int i=0;i<carNameLoads.length;i++){
			if(carNameLoads[i]==null) break;
			System.out.print(carNameLoads[i]+" ");
		}
		System.out.println();
		System.out.println("***租车总价格："+this.allRent);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用亮亮租车系统");
		System.out.println("你是否需要租车：1是    0否");
		isRentCar();
		showCarList();
		System.out.println("请输入要租车的数量:");
		StartCar user = new StartCar();
		user.getAllRentLoadsNumberName();
		user.showOrder();
	}
}
