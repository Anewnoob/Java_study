package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class SetTest {

	//List�Ｏ����ֻ�ܷ�Course��������������������������
	public List<Course> coursesToSelect;
	public SetTest(){
		this.coursesToSelect = new ArrayList<Course>();
	}
	
	public void listAdd(){
		Course c1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(c1);
		//ȡ������֤

		//ָ��λ�ò������.��������λ�ô��ڼ��ϳ��ȣ��ᷢ���±�Խ���쳣
		Course c2 = new Course("2", "C����");
		//���뵽C1ǰ�棬�����λ��Ϊ0
		coursesToSelect.add(0, c2);
		//coursesToSelect.addAll(c)����
		Course []courses = {new Course("3", "΢����1"),new Course("4", "΢����2") };
		coursesToSelect.addAll(Arrays.asList(courses));

	}
	
	//testforeach
	public void testForEach(){
		for (Course course : coursesToSelect) {
			System.out.println("�γ�ID��"+course.id+"\t�γ���:"+course.name);
		}
	}
	
	
	//��List������ѡ������γ̶������student.courses������
	public void cCourses(Student student){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<3; i++){
			System.out.println("������ѡ��ID");
			String coursesId = input.next();
			for (Course course : coursesToSelect) {
				if(course.id.equals(coursesId)){
					//�����ѡ������ķ���Set����У�Set�����в����ظ������������ͬ���Ľ�ȥ���൱�ڴ�NULL����������
					student.courses.add(course);
				}
			}
		}
	}
	
	public void showCourses(Student student){
		System.out.println(student.name+"ͬѧ��ѡ����"+student.courses.size()+"�ſγ�");
		for (Course course : student.courses) {
			System.out.println("ID:"+course.id+"\t�γ���:"+course.name);
		}
	}
	
	//�ж�һ�������Ƿ�����ڼ����У�List,Set����contain����List��Ҫ��дequals��������Set��Ҫ��дequals��hashcode����
	//�ж�Ԫ�ص�������ֻ��List�У�λ����indexOf��������Map�У��ж��Ƿ����Key��containsKey�������ж��Ƿ����value��containsValue
	//����
	public void testListContain(){
		Course course = coursesToSelect.get(0);
		//����true
		System.out.println("ȡ�ÿγ�id:"+course.id+"\tID��"+course.name);
		System.out.println("course�Ƿ������coursesToSelect������?"+coursesToSelect.contains(course));
		//����False   ԭ����contain�ķ���ԭ���ǵ���equals�������Ƚϵ��ǵ�ַ��course��course2�ĵ�ַ��һ����Ҫ�����Ҫ��д
		//equals��������Course����д
		Course course2 = new Course(course.id, course.name);
		System.out.println("course2�Ƿ������coursesToSelect������?"+coursesToSelect.contains(course2));
	}
	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest a1 = new SetTest();
		a1.listAdd();
		a1.testForEach();
		
		//����ѧ��
		Student student = new Student("1", "С��");
		System.out.println("��ӭѧ��"+student.name+"ѡ��!");
		//a1.cCourses(student);
		//a1.showCourses(student);
		a1.testListContain();
	}

}
