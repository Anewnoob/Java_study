package indi.liliang.study.helloworld;

//默认继承Object类
public class Initail {
	public int age=20;
	public String name="liliang";
	
	
/*	//重写Object类的toString方法
	@Override
	public String toString() {
		return "Initail [age=" + age + ", name=" + name + "]";
	}*/
	
/*	//重写Object equals()
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
		//被比较的对象是否为空
		if (obj == null)
			return false;
		//判断类的属性是否一样
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
		//打印类名+属性值（去注释）
		System.out.println(a);
		
		//Object equals()  这里的a1,a2并不是我们创建的对象，只是我们创建对象的地址，通过引用a1,a2间接操作对象
		//比较类的值是否相等要重写equals方法，去掉上面的注释。
		Initail a1=new Initail();
		Initail a2=new Initail();
		if(a1.equals(a2)){
			System.out.println("a1与a2相等");
		}
		else{System.out.println("a1，a2不相等");}
	}



}
