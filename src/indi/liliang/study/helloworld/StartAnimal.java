package indi.liliang.study.helloworld;

public class StartAnimal {

	public static void main(String[] args) {
		 
/*		// 引用多态     父类引用可以指向父类对象，又可以指向子类对象
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		Animal obj3 = new Cat();
		//Dog obj3 = new Animal();  错误  子类引用不可以只想父类对象
		 
		//方法多态
		obj1.eat();
		obj2.eat();
		obj3.eat();
		//obj3.sleep();   错误  父类中没有sleep方法，sleep 是子类独有的方法
*/	
	
		
		//多态中的引用类型转换
		Dog dog = new Dog();
		Animal animal = dog;    //向上类型转换，系统自动转换  dog->animal，无风险
/*		Dog dog2 = (Dog)animal;          //向下类型转换，必须强制转换，否则报错，有风险
										//一般情况下，都不能向下类型转换，但这里最开始animal指向Dog类型的内存，所以能强制转换成功
		Cat cat= (Cat)animal;			 //向下类型转换，必须强制转换，否则报错，有风险，这里不能转换成功
*/		
		
		//借助instanceof判断一个引用是否能转换成另一个类型，配合if使用
		if(animal instanceof Dog){
			Dog dog2 = (Dog)animal;
		}else{
			System.out.println("animal 不能转换成Dog类型");
		}
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}else{
			System.out.println("animal 不能转换成Cat类型");
		}
		
	}

}
