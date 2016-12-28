package indi.liliang.study.helloworld;

import java.util.Scanner;

public class StartBook {
	
	private static String book[]={
			"微积分",
			"C语言",
			"Java语言",
			"数据结构",
			"linux操作系统",
	};
	
	public  String ctype()throws ErrorCommandException{
		Scanner choice = new Scanner(System.in);
		String result = choice.nextLine();
		if(result.equals("1")||result.equals("2")){
			
		}
		else {
			throw new ErrorCommandException("输入命令错误");
		}
		return result;
	}
	
	public void findBook(String result)throws BookNotFoundException{
		if(result.equals("1")){
			System.out.print("请输入序号：");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if(number>book.length||number<1){
				throw new BookNotFoundException("序号超出范围(1-5)，请重新输入!");
			}else {
				System.out.println("book:"+book[number-1]);
			}
		}else {
			System.out.print("请输入图书名称：");
			Scanner input = new Scanner(System.in);
			String bookName = input.nextLine();
			int number=-1;
			for(int i=0;i<book.length;i++){
				if(bookName.equals(book[i])){
					number = i;
					break;
				}
			}
			if(number==-1){
				throw new BookNotFoundException("图书名("+bookName+")不存在，请重新输入");
			}else {
				System.out.println("book:"+book[number]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****欢迎来到借书系统！*****");
		StartBook sBook= new StartBook();
		
		while(true){
			System.out.println("请选择查找书的方法：1序号     2书名");
			String result="";
			//选择查找书的方法
			try {
				result = sBook.ctype(); 
			}catch (ErrorCommandException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			//找书
			try {
				sBook.findBook(result);
			}catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
				continue;
			}catch (Exception e) {
				System.out.println("请输入数字（1-5）");
			}
		}
	}
}
