package indi.liliang.study.helloworld;

public class BookNotFoundException extends Exception{
	public BookNotFoundException() {
		
	}
	
	public BookNotFoundException(String message){
		super(message);
	}
}
