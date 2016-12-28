package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	
	//Course����,ע�ⷺ��ʹ�û������ͣ�int,long boolean���ȣ�������ʹ�ö�Ӧ�İ�װ�ࣨInteger,Long,Boolean��
	public List<Course> coursesToSelect;
	public ListTest(){
		this.coursesToSelect = new ArrayList<Course>();
	}
	
	
	//��coursesToSelect��������Ӷ���
	public void listAdd(){
		Course c1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(c1);
		//ȡ������֤
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println(temp.id+":"+temp.name);
		
		//ָ��λ�ò������.��������λ�ô��ڼ��ϳ��ȣ��ᷢ���±�Խ���쳣
		Course c2 = new Course("2", "C����");
		//���뵽C1ǰ�棬�����λ��Ϊ0
		coursesToSelect.add(0, c2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2.id+":"+temp2.name);
		
		//coursesToSelect.addAll(c)����
		Course []courses = {new Course("3", "΢����1"),new Course("4", "΢����2") };
		coursesToSelect.addAll(Arrays.asList(courses));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println(temp3.id+":"+temp3.name);
		System.out.println(temp4.id+":"+temp4.name);
		//coursesToSelect.addAll(index, c)ͬadd
	}
	
	//����coursesToSelect����
	public void listGet(){
		System.out.println("�ܹ������¼��ſγ�:");
		for(int i= 0;i<coursesToSelect.size();i++){
			Course course = (Course)coursesToSelect.get(i);
			System.out.println("�γ� "+course.id+":"+course.name);
		}
	}
	
	//ͨ����������iterator������coursesToSelect����
	public void iterator(){
		Iterator i = coursesToSelect.iterator();
		System.out.println("ͨ����������iterator����ȡ�γ�");
		while(i.hasNext()){
			Course cr = (Course)i.next();
			System.out.println("�γ� "+cr.id+":"+cr.name);
		}
	}
	
	//�޸�coursesToSelect�����е�Ԫ��
	public void modify(){
		coursesToSelect.set(3, new Course("5", "ë��"));
		System.out.println("�޸ĺ�ļ����б�Ϊ��");
		iterator();
	}
	//ɾ��coursesToSelect�����е�Ԫ��
	public void delete(){
		coursesToSelect.remove(3);
		System.out.println("ɾ����ļ����б�Ϊ��");
		iterator();
	}
	
	//���ͼ��Ͽ�����ӷ��������ʵ������
	public void testChild(){
		SonCourses cr = new SonCourses("6","��������");
		coursesToSelect.add(cr);
	}
	
	public static void main(String[] args) {
		ListTest a1 = new ListTest();
		a1.listAdd();
		a1.testChild();
		a1.listGet();
		a1.iterator();
		a1.modify();
		a1.delete();
	}

}
