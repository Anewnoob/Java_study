package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class SetTest {

	//List里集合中只能放Course对象或者他的子类对象。其他出错
	public List<Course> coursesToSelect;
	public SetTest(){
		this.coursesToSelect = new ArrayList<Course>();
	}
	
	public void listAdd(){
		Course c1 = new Course("1", "数据结构");
		coursesToSelect.add(c1);
		//取出来验证

		//指定位置插入对象.如果插入的位置大于集合长度，会发生下标越界异常
		Course c2 = new Course("2", "C语言");
		//插入到C1前面，插入的位置为0
		coursesToSelect.add(0, c2);
		//coursesToSelect.addAll(c)方法
		Course []courses = {new Course("3", "微积分1"),new Course("4", "微积分2") };
		coursesToSelect.addAll(Arrays.asList(courses));

	}
	
	//testforeach
	public void testForEach(){
		for (Course course : coursesToSelect) {
			System.out.println("课程ID："+course.id+"\t课程名:"+course.name);
		}
	}
	
	
	//从List集合中选择出来课程对象放入student.courses集合中
	public void cCourses(Student student){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<3; i++){
			System.out.println("请输入选课ID");
			String coursesId = input.next();
			for (Course course : coursesToSelect) {
				if(course.id.equals(coursesId)){
					//这里把选择出来的放入Set结合中，Set集合中不能重复，无序，如果传同样的进去，相当于传NULL，但不报错
					student.courses.add(course);
				}
			}
		}
	}
	
	public void showCourses(Student student){
		System.out.println(student.name+"同学共选择了"+student.courses.size()+"门课程");
		for (Course course : student.courses) {
			System.out.println("ID:"+course.id+"\t课程名:"+course.name);
		}
	}
	
	//判断一个对象是否包含在集合中（List,Set）用contain方法List需要重写equals方法，而Set需要重写equals和hashcode函数
	//判断元素的索引（只在List中）位置用indexOf方法。在Map中，判断是否包含Key用containsKey方法，判断是否包含value用containsValue
	//方法
	public void testListContain(){
		Course course = coursesToSelect.get(0);
		//返回true
		System.out.println("取得课程id:"+course.id+"\tID："+course.name);
		System.out.println("course是否包含在coursesToSelect集合中?"+coursesToSelect.contains(course));
		//返回False   原因是contain的方法原理是调用equals方法，比较的是地址，course和course2的地址不一样，要相等需要重写
		//equals方法，在Course中重写
		Course course2 = new Course(course.id, course.name);
		System.out.println("course2是否包含在coursesToSelect集合中?"+coursesToSelect.contains(course2));
	}
	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest a1 = new SetTest();
		a1.listAdd();
		a1.testForEach();
		
		//创建学生
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生"+student.name+"选课!");
		//a1.cCourses(student);
		//a1.showCourses(student);
		a1.testListContain();
	}

}
