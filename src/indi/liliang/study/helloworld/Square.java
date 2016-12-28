package indi.liliang.study.helloworld;

public class Square {
	public void squre(int n){
		int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("%02d ",num++);
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		Square a=new Square();
		a.squre(6);
	}
}
