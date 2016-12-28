package indi.liliang.study.helloworld;

public class StartException {

	public void test1(int i) throws DrunkException{
		if(i==1){
			throw new DrunkException("你喝醉了！");
		}else {
			System.out.println("你没喝醉");
		}
	}
	
	public void test2(){
		try{
			test1(1);
		}catch(DrunkException e){
			RuntimeException newec = new RuntimeException("喝醉要出车祸！");
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
			System.out.println(" Exception处理完了");
		}
	}

}
