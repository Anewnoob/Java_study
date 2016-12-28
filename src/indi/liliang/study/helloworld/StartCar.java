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
				System.out.println("��ӭ�´ι���!ByeBye!");
				return;
		 }
	}
	
	public static void showCarList(){
		int count =1;
		System.out.println("�����⳵�����ͼ����Ŀ��");
		System.out.println("���\t��������\t���\t����");
		for(int i=0;i<car.length;i++,count++){
			if(car[i] instanceof CarryPepleCar){
				System.out.println(count+"."+"\t"+((CarryPepleCar)car[i]).carName+" \t"+((CarryPepleCar)car[i]).rent+"Ԫ/��"+"\t"+"���ˣ�"+((CarryPepleCar)car[i]).number+"��");
			}
			if(car[i] instanceof CarryLoadsCar){
				System.out.println(count+"."+"\t"+((CarryLoadsCar)car[i]).carName+" \t"+((CarryLoadsCar)car[i]).rent+"Ԫ/��"+"\t"+"�ػ���"+((CarryLoadsCar)car[i]).loads);
			}
			if(car[i] instanceof PiCar){
				System.out.println(count+"."+"\t"+((PiCar)car[i]).carName+" \t"+((PiCar)car[i]).rent+"Ԫ/��"+"\t"+"���ˣ�"+((PiCar)car[i]).number+"��,�ػ���"+((PiCar)car[i]).loads);
			}
		}
	}
	
	public  void getAllRentLoadsNumberName(){
		Scanner cin = new Scanner(System.in);
		int carNumber=cin.nextInt();
		for(int i=0,j=0,k=0;i<carNumber;i++){
			System.out.println("�������"+(i+1)+"���������");
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
		System.out.println("�������⳵������");
		int days=cin.nextInt();
		this.allRent*=days;
	}

	public void showOrder(){
		System.out.println("�����˵�:");
		System.out.println("***�����˵��У�");
		for(int i=0;i<carNamePeple.length;i++){
			if(carNamePeple[i]==null) break;
			System.out.print(carNamePeple[i]+" ");
			
		}
		System.out.println();
		System.out.println("***���ػ����У�");
		for(int i=0;i<carNameLoads.length;i++){
			if(carNameLoads[i]==null) break;
			System.out.print(carNameLoads[i]+" ");
		}
		System.out.println();
		System.out.println("***�⳵�ܼ۸�"+this.allRent);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ�������⳵ϵͳ");
		System.out.println("���Ƿ���Ҫ�⳵��1��    0��");
		isRentCar();
		showCarList();
		System.out.println("������Ҫ�⳵������:");
		StartCar user = new StartCar();
		user.getAllRentLoadsNumberName();
		user.showOrder();
	}
}
