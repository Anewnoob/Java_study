package indi.liliang.study.helloworld;

import java.util.Scanner;

public class StartBook {
	
	private static String book[]={
			"΢����",
			"C����",
			"Java����",
			"���ݽṹ",
			"linux����ϵͳ",
	};
	
	public  String ctype()throws ErrorCommandException{
		Scanner choice = new Scanner(System.in);
		String result = choice.nextLine();
		if(result.equals("1")||result.equals("2")){
			
		}
		else {
			throw new ErrorCommandException("�����������");
		}
		return result;
	}
	
	public void findBook(String result)throws BookNotFoundException{
		if(result.equals("1")){
			System.out.print("��������ţ�");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if(number>book.length||number<1){
				throw new BookNotFoundException("��ų�����Χ(1-5)������������!");
			}else {
				System.out.println("book:"+book[number-1]);
			}
		}else {
			System.out.print("������ͼ�����ƣ�");
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
				throw new BookNotFoundException("ͼ����("+bookName+")�����ڣ�����������");
			}else {
				System.out.println("book:"+book[number]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****��ӭ��������ϵͳ��*****");
		StartBook sBook= new StartBook();
		
		while(true){
			System.out.println("��ѡ�������ķ�����1���     2����");
			String result="";
			//ѡ�������ķ���
			try {
				result = sBook.ctype(); 
			}catch (ErrorCommandException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			//����
			try {
				sBook.findBook(result);
			}catch (BookNotFoundException e) {
				System.out.println(e.getMessage());
				continue;
			}catch (Exception e) {
				System.out.println("���������֣�1-5��");
			}
		}
	}
}
