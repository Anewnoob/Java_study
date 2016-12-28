package indi.liliang.study.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	
	//Course泛型,注意泛型使用基本类型（int,long boolean）等，但可以使用对应的包装类（Integer,Long,Boolean）
	public List<Course> coursesToSelect;
	public ListTest(){
		this.coursesToSelect = new ArrayList<Course>();
	}
	
	
	//往coursesToSelect集合中添加对象
	public void listAdd(){
		Course c1 = new Course("1", "数据结构");
		coursesToSelect.add(c1);
		//取出来验证
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println(temp.id+":"+temp.name);
		
		//指定位置插入对象.如果插入的位置大于集合长度，会发生下标越界异常
		Course c2 = new Course("2", "C语言");
		//插入到C1前面，插入的位置为0
		coursesToSelect.add(0, c2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2.id+":"+temp2.name);
		
		//coursesToSelect.addAll(c)方法
		Course []courses = {new Course("3", "微积分1"),new Course("4", "微积分2") };
		coursesToSelect.addAll(Arrays.asList(courses));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println(temp3.id+":"+temp3.name);
		System.out.println(temp4.id+":"+temp4.name);
		//coursesToSelect.addAll(index, c)同add
	}
	
	//遍历coursesToSelect集合
	public void listGet(){
		System.out.println("总共有如下几门课程:");
		for(int i= 0;i<coursesToSelect.size();i++){
			Course course = (Course)coursesToSelect.get(i);
			System.out.println("课程 "+course.id+":"+course.name);
		}
	}
	
	//通过过迭代器iterator来遍历coursesToSelect集合
	public void iterator(){
		Iterator i = coursesToSelect.iterator();
		System.out.println("通过过迭代器iterator来获取课程");
		while(i.hasNext()){
			Course cr = (Course)i.next();
			System.out.println("课程 "+cr.id+":"+cr.name);
		}
	}
	
	//修改coursesToSelect集合中的元素
	public void modify(){
		coursesToSelect.set(3, new Course("5", "毛概"));
		System.out.println("修改后的集合列表为：");
		iterator();
	}
	//删除coursesToSelect集合中的元素
	public void delete(){
		coursesToSelect.remove(3);
		System.out.println("删除后的集合列表为：");
		iterator();
	}
	
	//泛型集合可以添加泛型子类的实例对象
	public void testChild(){
		SonCourses cr = new SonCourses("6","我是子类");
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
