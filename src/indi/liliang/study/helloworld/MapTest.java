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
	
	//�Ѽ�ֵ�Է���Map������  ,put
	public void testPut(){
		Scanner input  = new Scanner(System.in);
		for(int i = 0;i<3;){
			System.out.println("������ѧ��ID");
			String id = input.next();
			Student sd = student.get(id);
			if(sd ==null){
				System.out.println("������ѧ������");
				String name = input.next();
				Student newstudent = new Student(id, name);
				student.put(id,newstudent);
				System.out.println("�ɹ����ѧ��"+student.get(id).name);
				i++;
			}else {
				System.out.println("�Ѵ��ڸ�ID������������");
				continue;
			}
		}
	}
	
	//ȡ��Map���������еļ�����ȡ��ֵ��
	public void testKeySet(){
		System.out.println("��������"+student.size()+"λѧ��");
		Set<String>Keyset = student.keySet();
		for (String st : Keyset) {
			Student sd = student.get(st);
			System.out.println("ID:"+sd.id+"\t������"+sd.name);
		}
	}
	
	//ɾ��remove
	public void testremove(){
		//student.remove(key);
	}
	
	//�޸�modify  ע�⣬map��put�����ǰ�һ����ֵ�Է��뼯�ϣ�������ڣ����滻ԭ���ģ������ڣ��൱�����
	public void testmodify(){
		//student.put(key, value);
	}
	
	//�������м�ֵ�Եļ���
	public void testEntrySet(){
		Set<Entry<String, Student>> entrySet = student.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ��ID��"+entry.getKey()+"\tȡ��ֵ��"+entry.getValue().name);
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
