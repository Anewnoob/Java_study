package indi.liliang.study.helloworld;

public class StartAnimal {

	public static void main(String[] args) {
		 
/*		// ���ö�̬     �������ÿ���ָ��������ֿ���ָ���������
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		Animal obj3 = new Cat();
		//Dog obj3 = new Animal();  ����  �������ò�����ֻ�븸�����
		 
		//������̬
		obj1.eat();
		obj2.eat();
		obj3.eat();
		//obj3.sleep();   ����  ������û��sleep������sleep ��������еķ���
*/	
	
		
		//��̬�е���������ת��
		Dog dog = new Dog();
		Animal animal = dog;    //��������ת����ϵͳ�Զ�ת��  dog->animal���޷���
/*		Dog dog2 = (Dog)animal;          //��������ת��������ǿ��ת�������򱨴��з���
										//һ������£���������������ת�����������ʼanimalָ��Dog���͵��ڴ棬������ǿ��ת���ɹ�
		Cat cat= (Cat)animal;			 //��������ת��������ǿ��ת�������򱨴��з��գ����ﲻ��ת���ɹ�
*/		
		
		//����instanceof�ж�һ�������Ƿ���ת������һ�����ͣ����ifʹ��
		if(animal instanceof Dog){
			Dog dog2 = (Dog)animal;
		}else{
			System.out.println("animal ����ת����Dog����");
		}
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}else{
			System.out.println("animal ����ת����Cat����");
		}
		
	}

}
