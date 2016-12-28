package indi.liliang.study.helloworld;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Student> student;
	
	public MapTest(){
		this.student=new HashMap<String,Student>();
	}
	
	//把键值对放入Map集合中  ,put
	public void testPut(){
		Scanner input  = new Scanner(System.in);
		for(int i = 0;i<3;){
			System.out.println("请输入学生ID");
			String id = input.next();
			Student sd = student.get(id);
			if(sd ==null){
				System.out.println("请输入学生姓名");
				String name = input.next();
				Student newstudent = new Student(id, name);
				student.put(id,newstudent);
				System.out.println("成功添加学生"+student.get(id).name);
				i++;
			}else {
				System.out.println("已存在该ID，请重新输入");
				continue;
			}
		}
	}
	
	//取出Map集合中所有的键（来取得值）
	public void testKeySet(){
		System.out.println("共输入了"+student.size()+"位学生");
		Set<String>Keyset = student.keySet();
		for (String st : Keyset) {
			Student sd = student.get(st);
			System.out.println("ID:"+sd.id+"\t姓名："+sd.name);
		}
	}
	
	//删除remove
	public void testremove(){
		//student.remove(key);
	}
	
	//修改modify  注意，map的put方法是把一个键值对放入集合，如果存在，则替换原来的，不存在，相当于添加
	public void testmodify(){
		//student.put(key, value);
	}
	
	//返回所有键值对的集合
	public void testEntrySet(){
		Set<Entry<String, Student>> entrySet = student.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得ID："+entry.getKey()+"\t取得值："+entry.getValue().name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mTest = new MapTest();
		mTest.testPut();
		mTest.testKeySet();
		mTest.testEntrySet();
	}

}
