package indi.liliang.study.helloworld;

public class StartException {

	public void test1(int i) throws DrunkException{
		if(i==1){
			throw new DrunkException("������ˣ�");
		}else {
			System.out.println("��û����");
		}
	}
	
	public void test2(){
		try{
			test1(1);
		}catch(DrunkException e){
			RuntimeException newec = new RuntimeException("����Ҫ��������");
			newec.initCause(e);
			throw newec;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartException person = new StartException();
		try{
			person.test2();
		}catch(Exception e){
			e.printStackTrace();
			//System.err.println(e.getMessage());
		}finally {
			System.out.println(" Exception��������");
		}
	}

}
