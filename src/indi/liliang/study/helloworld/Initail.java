package indi.liliang.study.helloworld;

//Ĭ�ϼ̳�Object��
public class Initail {
	public int age=20;
	public String name="liliang";
	
	
/*	//��дObject���toString����
	@Override
	public String toString() {
		return "Initail [age=" + age + ", name=" + name + "]";
	}*/
	
/*	//��дObject equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		//���ȽϵĶ����Ƿ�Ϊ��
		if (obj == null)
			return false;
		//�ж���������Ƿ�һ��
		if (getClass() != obj.getClass())
			return false;
		Initail other = (Initail) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	//main
	public static void main(String[] args) {
		// toString
		Initail a = new Initail();
		//��ӡ����+����ֵ��ȥע�ͣ�
		System.out.println(a);
		
		//Object equals()  �����a1,a2���������Ǵ����Ķ���ֻ�����Ǵ�������ĵ�ַ��ͨ������a1,a2��Ӳ�������
		//�Ƚ����ֵ�Ƿ����Ҫ��дequals������ȥ�������ע�͡�
		Initail a1=new Initail();
		Initail a2=new Initail();
		if(a1.equals(a2)){
			System.out.println("a1��a2���");
		}
		else{System.out.println("a1��a2�����");}
	}



}
