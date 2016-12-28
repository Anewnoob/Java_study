package indi.liliang.study.helloworld;

public class Course {
	public String id;
	public String name;
	
	public Course(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else{
			if(obj instanceof Course){
				Course course = (Course)obj;
				if(this.name.equals(course.name)){
					return true;
				}else {
					return false;
				}
			}else{
				return false;
			}
		}
	}
}
